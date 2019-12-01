grammar Interpreter;

start  : block  EOF
       ;

block: '{' decls stmts '}'
        ;

decls:
        | decls decl
        ;

decl: type ID ';'
        ;

type:   'int'
        | 'float'
        | 'bool'
        ;

stmts:
        | stmts stmt
        ;

assign: ID '=' allexpr ';'
        | incdecexpr
        ;

stmt: assign
        | 'range''(' allexpr',' allexpr')'stmt
        | 'if''(' allexpr ')' stmt
        | 'if''(' allexpr ')' stmt 'else' stmt
        | 'while''(' allexpr ')' stmt
        | 'do' stmt 'while''(' allexpr ')' ';'
        | 'for''(' assign allexpr ';' incdecexpr ')' stmt
        | 'break'';'
        | block
        ;

allexpr : allexpr '||' andexpr
        | andexpr
        ;

andexpr : andexpr '&&' equal
        | equal
        ;

equal : equal '==' rel
        | equal '!=' rel
        | rel
        ;

rel : expr '<' expr
        | expr '<=' expr
        | expr '>' expr
        | expr '>=' expr
        | expr
        ;

expr : expr '+' term
        | expr '-' term
        | term
        ;

term : term '*' factor
        | term '/' factor
        | factor
        ;

incdecexpr : ID'++'
            | ID'--'
            | ID'++'';'
            | ID '--'';'
            ;

factor : '(' allexpr ')'
        | incdecexpr
        | ID
        | NUM
        | 'real'
        | 'true'
        | 'false'
        ;

WHILE  : 'while';
ASSIGN : '=';
NOTEQUAL : '!=';
RANGE: 'range';


ID     :  [a-zA-Z][a-zA-z0-9]*;
NUM    :  '0'..'9'+;
PLUS   :  '+';
MINUS  :  '-';
WS     : [ \t \n \r]+ -> skip;