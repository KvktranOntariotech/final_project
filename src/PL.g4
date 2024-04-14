grammar PL;

@header {
import backend.*;
}

@members {
}

program returns [Expr expr]:
    {List<Expr> statements = new ArrayList<Expr>();}
    (statement {statements.add($statement.expr);})+ EOF
    {$expr = new Block(statements);}
;
    
operator returns [Operator op]:
    PLUS {$op = Operator.Add;}
    | MINUS {$op = Operator.Sub;}
    | MULT {$op = Operator.Mul;}
    | DIV {$op = Operator.Div;}
    | PPLUS {$op = Operator.Pplus;}
;

comparator returns [Comparator com]:
    LT {$com = Comparator.LT;}
    | LE {$com = Comparator.LE;}
    | GT {$com = Comparator.GT;}
    | GE {$com = Comparator.GE;}
    | EQ {$com = Comparator.EQ;}
    | NE {$com = Comparator.NE;}
;

value returns [Expr expr]:
    NUMBER { $expr = new IntLiteral($NUMBER.text); }
    | BOOL {$expr = new BooleanLiteral($BOOL.text); }
    | STRING {$expr = new StringLiteral($STRING.text); }
    | ID {$expr = new Deref($ID.text); }
;

expression returns [Expr expr]:
    invoke {$expr = $invoke.expr;}
    | '(' expression ')' {$expr = $expression.expr;}
    | value operator v2=expression {$expr = new Arithmetics($operator.op, $value.expr, $v2.expr);}
    | v1=expression comparator v2=expression {$expr = new Compare($comparator.com, $v1.expr, $v2.expr);}
    | value {$expr = $value.expr;}
;

invoke returns [Expr expr]:
    {List<Expr> elist = new ArrayList<Expr>();}
    name=ID '(' argumentList? ')'
    {$expr = new Invoke($name.text, $argumentList.calls);}
;

argumentList returns [List<Expr> calls]: e1=expression {$calls = new ArrayList<Expr>(); $calls.add($e1.expr);} (',' e2=expression {$calls.add($e2.expr);})*;

statement returns [Expr expr]:
    expression {$expr = $expression.expr;}
    
    | assignment {$expr = $assignment.expr;}
    
    | 'print(' statement ')' {$expr = new Print($statement.expr);}
    
    | 
        {List<Expr> statements = new ArrayList<Expr>();}
        'for(' ID 'in' e1=expression '..' e2=expression ')' '{' (body=statement {statements.add($body.expr);})+ '}'
        {$expr = new ForLoop($ID.text, $e1.expr, $e2.expr, new Block(statements));} 
        
    | 
        {
            List<Expr> statements1 = new ArrayList<Expr>();
            List<Expr> statements2 = new ArrayList<Expr>();
        }
        'if' '(' cond=expression ')' '{' (s1=statement {statements1.add($s1.expr);})+ '}' 'else' '{' (s2=statement {statements2.add($s2.expr);})+ '}'
        {$expr = new Ifelse($cond.expr, new Block(statements1), new Block(statements2));}
        
    | 
        {
            List<String> alist = new ArrayList<String>();
            List<Expr> statements = new ArrayList<Expr>();
        }
        'function' name=ID '(' (arg=ID ','? {alist.add($arg.text);})* ')' '{' (body=statement {statements.add($body.expr);})+ '}'
        {$expr = new Declare($name.text, alist, new Block(statements));}
;
 
assignment returns [Expr expr]
    : ID '=' expression {$expr = new Assign($ID.text, $expression.expr);}
    | ID ':' TYPE '=' expression {
                                        new isAssignable($TYPE.text, $expression.expr);
                                        
                                        $expr = new Assign($ID.text, $expression.expr);
                                        
                                    }
    ;
    
//ID_COLON_TYPE returns [Expr expr]
//    : ID ':' TYPE;
    
// Lexer here
STRING : '"' (ESC | ~["\\])* '"' ;
BOOL : TRUE | FALSE;

fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

NUMBER 	: INT '.' INT EXP? // 1.35, 1.35E-9, 0.3, -4.5
	| INT EXP // 1e10 -3e4
	| INT // -3, 45
	;

fragment INT : '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP : [Ee] [+\-]? INT ; // \- since - means "range" inside [...]

ID: [a-zA-Z] [a-zA-Z0-9_]*;

TYPE: 'int' | 'bool' | 'string' | 'float';

TRUE: 'true';
FALSE: 'false';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
PPLUS: '++';

LT: '<';
LE: '<=';
GT: '>';
GE: '>=';
EQ: '==';
NE: '!=';

COMMENT: '/*' .*? '*/' -> skip;
SEMI_COLON : ';' -> skip;
WHITESPACE : [ \t\r\n] -> skip;