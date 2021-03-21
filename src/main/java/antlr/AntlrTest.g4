grammar AntlrTest;
/*r  : 'j' ID+ ;
ID : [a-z]+ | [A-Z]+ ;
WS : [ \t\r\n]+ -> skip ;
digit : 'digit' NUM+;*/


NUM :  [0-9]+;
UNARY_OPERATOR_SIDE: 'left'|'right';
MULTIPLICATION : '*';
DIV: '/';
PLUS: '+';
MINUS: '-';
LOGIC: '&&'|'||';
COMPARE:'!='|'=='|'<'|'>'|'>='|'<=';
UNARY_OPERATOR: '--'|'++';
MAIN_FUNCTION_ID:'mainauf';
NAME : [a-z]+|[A-Z]+;
TYPE: 'Integer'|'Double';

parameter: (TYPE NAME|NUM|NAME)?;

expression:
 UNARY_OPERATOR_SIDE UNARY_OPERATOR expression  #unaryOperator
| TYPE ((NAME '=' expression|)identifier) #defineVariable
| '('expression')' #parens
| expression operation =(MULTIPLICATION|DIV) expression #mulDiv
| expression operation =(PLUS|MINUS) expression #plusMinus
| expression operation =COMPARE expression #compare
| expression operation = LOGIC expression #logic
| expression '^' expression #idk
| '!' expression #not
| NAME #name
| NUM #num
|identifier #id
;

identifier:NAME '=' NUM;

WHITESPACE: [ \t\r\n]+ -> skip;
function:  'auf' TYPE NAME '(' parameter (',' parameter)* ')' '{' statement* '}';
mainFunction: MAIN_FUNCTION_ID'{' statement* '}';

return_Rule:  'return' expression ';' ;
if_Rule: 'if' '(' expression')' '{'(statement';')*  '}' ('else' ('if' '(' expression')')? '{'statement '}')*;
while_Rule:'while' '(' expression ')' '{'(statement';')* '}';
for_Rule:'for' '(' parameter';'expression';'expression')' '{'statement*'}' ;
break_Rule:'break';
continue_Rule:'continue';
statement_rules:(return_Rule|if_Rule|while_Rule|for_Rule|break_Rule|continue_Rule|expression+);

statement:statement_rules+;

cool:(function+|mainFunction)* ;
