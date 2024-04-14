package backend

abstract class Data

object None:Data() {
    override fun toString() = "None"
}

class IntData(val value:Int): Data() {
    override fun toString(): String = "$value"
}

class BooleanData(val value:Boolean): Data() {
    override fun toString() = 
    "${value}"
}

class StringData(var value:String): Data() {
    override fun toString(): String {
        value = value.substring(1, value.length - 1)
        return "$value"
    }
}

class FuncData(
    val name: String,
    val params: List<String>,
    val body: Expr
): Data() {
    override fun toString()
    = params.joinToString(", ").let {
        "$name($it) { ... }"
    }
}

fun <T> stringify(input: T): String {
    return input.toString()
}
