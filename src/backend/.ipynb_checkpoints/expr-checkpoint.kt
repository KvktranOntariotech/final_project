package backend

enum class Operator {
    Add,
    Sub,
    Mul,
    Div,
    Pplus
}

enum class Comparator {
    LT,
    LE,
    GT,
    GE,
    EQ,
    NE,
}

abstract class Expr {
    abstract fun eval(runtime:Runtime):Data
}

class NoneExpr(): Expr() {
    override fun eval(runtime:Runtime) = None
}

class IntLiteral(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = IntData(Integer.parseInt(lexeme))
}

class StringLiteral(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = StringData(lexeme)
}

class BooleanLiteral(val lexeme:String): Expr() {
    override fun eval(runtime:Runtime): Data
    = BooleanData(lexeme.equals("true"))
}

class Arithmetics(
    val op:Operator,
    val left:Expr,
    val right:Expr
): Expr() {
    override fun eval(runtime:Runtime): Data {
        val x = left.eval(runtime)
        val y = right.eval(runtime)
        if (x is IntData && y is IntData) {
            return IntData(
                when(op) {
                    Operator.Add -> x.value + y.value
                    Operator.Sub -> x.value - y.value
                    Operator.Mul -> x.value * y.value
                    Operator.Div -> {
                        if(y.value != 0) {
                            x.value / y.value
                        } else {
                            throw Exception("cannot divide by zero")
                        }
                    }
                    else -> throw Exception("Unknown operator")
                }
            )
        } 
        else if (x is StringData && y is StringData) {
            return StringData(
                when(op) {
                    Operator.Pplus -> {              
                        val result = "\"$x$y\""
                        return StringData(result)
                    }
                    else -> throw Exception("Unknown operator")
                }
            )
        }
        else if (x is StringData && y is IntData) {
            return StringData(
                when (op) {
                    Operator.Mul -> {
                        var result = "$x".repeat(y.value)
                        result = "\"$result\""
                        return StringData(result)
                    }
                    else -> throw Exception("Unknown operator") 
                }
            )
        }
        else {
            throw Exception("Invalid Type")
        } 
    }
}

class Assign(val symbol:String, val expr:Expr): Expr() {
    override fun eval(runtime:Runtime): Data
    = expr.eval(runtime).apply {
        runtime.symbolTable.put(symbol, this)
    }
}

class Deref(val name:String): Expr() {
    override fun eval(runtime:Runtime):Data {
        val data = runtime.symbolTable[name]
        if(data == null) {
            throw Exception("$name is not assigned.")
        }
        return data
    }
}

class Block(val exprList: List<Expr>): Expr() {
    override fun eval(runtime:Runtime): Data {
        var result:Data = None
        exprList.forEach {
            result = it.eval(runtime)
        }
        return result
    }
}

class Compare(
    val comparator: Comparator,
    val left: Expr,
    val right: Expr
): Expr() {
    override fun eval(runtime:Runtime): Data {
        val x = left.eval(runtime)
        val y = right.eval(runtime)
        if(x is IntData && y is IntData) {
            return BooleanData(
                when(comparator) {
                    Comparator.LT -> x.value < y.value
                    Comparator.LE -> x.value <= y.value
                    Comparator.GT -> x.value > y.value
                    Comparator.GE -> x.value >= y.value
                    Comparator.EQ -> x.value == y.value
                    Comparator.NE -> x.value != y.value
                }
            )
        } else {
            throw Exception("Non-integer data in comparison")
        }
    }
}

class Ifelse(
    val cond:Expr,
    val trueExpr:Expr,
    val falseExpr:Expr
): Expr() {
    override fun eval(runtime:Runtime): Data {
        val cond_data = cond.eval(runtime)
        if(cond_data !is BooleanData) {
            throw Exception("need boolean data in if-else")
        }
        if(cond_data.value) {
            return trueExpr.eval(runtime)
        } else {
            return falseExpr.eval(runtime)
        }
    }
}

class ForLoop(
    val symbol: String,
    val fromVal: Expr,
    val toVal: Expr,
    val body: Expr
) : Expr() {
    override fun eval(runtime:Runtime): Data {
        val x = fromVal.eval(runtime)
        val y = toVal.eval(runtime)
        
        runtime.symbolTable.put(symbol, x)
        var result: Data = None
        if (x is IntData && y is IntData) {
            for (i in x.value..y.value) {
                runtime.symbolTable[symbol] = IntData(i)
                result = body.eval(runtime)
            }
        } 
        else
        {
            throw Exception("Non-integer in for loop")
        }
        runtime.symbolTable.remove(symbol)
        return result
    }
}

class Declare(
    val name: String,
    val params: List<String>,
    val body: Expr
): Expr() {
    override fun eval(runtime:Runtime):Data
    = FuncData(name, params, body).also {
        runtime.symbolTable[name] = it
    }
}

class Invoke(val name:String, val args:List<Expr>):Expr() {
    override fun eval(runtime:Runtime):Data {
        val func:Data? = runtime.symbolTable[name]
        if(func == null) {
            throw Exception("$name does not exist")
        }
        if(func !is FuncData) {
            throw Exception("$name is not a function.")
        }
        if(func.params.size != args.size) {
            for (i in args) {
                println(i)
            }
            throw Exception(
                "$name expects ${func.params.size} arguments "
                + "but received ${args.size}"
            )
        }
        
        val r = runtime.subscope(
            func.params.zip(args.map {it.eval(runtime)}).toMap()
        )
        return func.body.eval(r)
    }
}

class Print(
    val body: Expr
) : Expr() {
    override fun eval(runtime:Runtime): None {
        val result = body.eval(runtime)
        println(result)
        return None
    } 
}