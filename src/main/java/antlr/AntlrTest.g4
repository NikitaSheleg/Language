grammar AntlrTest;
/*r  : 'j' ID+ ;
ID : [a-z]+ | [A-Z]+ ;
WS : [ \t\r\n]+ -> skip ;
digit : 'digit' NUM+;*/


NUM :  [0-9]+;
MULTIPLICATION : '*';
DIV: '/';
PLUS: '+';
MINUS: '-';
LOGIC: '&&'|'||';
COMPARE:'!='|'=='|'<'|'>'|'>='|'<=';
UNARY_OPERATOR: '--'|'++';
NAME : [a-z]+|[A-Z]+;
TYPE: 'Integer'|'Double';

parameter: expression (NAME|NUM);

expression:
  TYPE expression #type
| '('expression')' #parens
| expression operation =(MULTIPLICATION|DIV) expression #mulDiv
| expression operation =(PLUS|MINUS) expression #plusMinus
| expression operation =COMPARE expression #compare
| expression operation = LOGIC expression #logic
| <assoc=right> expression '^' expression #idk
| '!' expression #not
| NAME #name
| UNARY_OPERATOR expression #unaryLeft
| expression UNARY_OPERATOR #unaryRight

| NUM #num
| NAME '=' NUM #id

;

WHITESPACE: [ \t\r\n]+ -> skip;

return:  'return' expression ';' ;
if: 'if' '(' expression')' '{'statement '}' ('else' ('if' '(' expression')')? '{'statement '}')*;
while:'while' '(' expression ')' '{'statement '}';
for:'for' '(' parameter';'expression';'expression')' '{'statement'}' ;
break:'break;';
continue:'continue;';


statement:(return|if|while|for|break|continue|expression+);
function:  'auf' TYPE NAME '(' expression ')' '{' statement '}';
cool:statement*;