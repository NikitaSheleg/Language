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
UNARY_OPERATOR_SIDE: 'left'|'right';
parameter: (TYPE NAME|NUM|NAME)?;

expression:
  TYPE ((NAME '=' expression|)identifier) #defineVariable
| '('expression')' #parens
| expression operation =(MULTIPLICATION|DIV) expression #mulDiv
| expression operation =(PLUS|MINUS) expression #plusMinus
| expression operation =COMPARE expression #compare
| expression operation = LOGIC expression #logic
| <assoc=right> expression '^' expression #idk
| '!' expression #not
| NAME #name
| (UNARY_OPERATOR_SIDE UNARY_OPERATOR expression ) #unaryOperator
| NUM #num
|identifier #id
;

identifier:NAME '=' NUM;

WHITESPACE: [ \t\r\n]+ -> skip;

return_Rule:  'return' expression ';' ;
if_Rule: 'if' '(' expression')' '{'statement '}' ('else' ('if' '(' expression')')? '{'statement '}')*;
while_Rule:'while' '(' expression ')' '{'statement '}';
for_Rule:'for' '(' parameter';'expression';'expression')' '{'statement'}' ;
break_Rule:'break;';
continue_Rule:'continue;';
statement_rules:(return_Rule|if_Rule|while_Rule|for_Rule|break_Rule|continue_Rule);

statement:statement_rules+;
function:  'auf' TYPE NAME '(' parameter ')' '{' statement '}';
mainFunction: 'main' function;
cool:(statement|function|mainFunction|expression+)+;