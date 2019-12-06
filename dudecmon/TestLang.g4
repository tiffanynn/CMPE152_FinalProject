grammar TestLang;


program: statement+;

statement: assign | show | expr;

assign: VAR '=' DOLLAS ;
show: 'show' (DOLLAS | VAR);
expr: DOLLAS '<' DOLLAS;

VAR : [a-z]+;
DOLLAS: [0-9]+;
WS:  [ \t \n \r]+ -> skip;


