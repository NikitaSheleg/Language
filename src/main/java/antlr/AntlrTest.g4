grammar AntlrTest;
/*r  : 'j' ID+ ;
ID : [a-z]+ | [A-Z]+ ;
WS : [ \t\r\n]+ -> skip ;
digit : 'digit' NUM+;*/

PT:'.';
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
TYPE: 'Integer'|'Float';
dbl : NUM+ PT NUM+;

parameter: ((TYPE NAME)|NUM|NAME)?;


expression:
 UNARY_OPERATOR_SIDE UNARY_OPERATOR NAME  #unaryOperator
| TYPE (identifier|(NAME '=' expression)) #defineVariable
| '('expression')' #parens
| expression operation =(MULTIPLICATION|DIV) expression #mulDiv
| expression operation =(PLUS|MINUS) expression #plusMinus
| expression operation =COMPARE expression #compare
| expression operation = LOGIC expression #logic
| expression '^' expression #idk
| '!' expression #not
| NAME #name
| (NUM|dbl) #num
| '('TYPE')' (NUM|dbl|NAME)#typeConverter
|identifier #id
|NAME '=' function_call#varEqlsFunc

;

identifier:NAME '=' NUM|dbl;

WHITESPACE: [ \t\r\n]+ -> skip;
function:  'auf' TYPE NAME '(' parameter (',' parameter)* ')' '{' statement* return_Rule'}';
mainFunction: MAIN_FUNCTION_ID'{' statement* '}';
function_call: 'wuf' NAME '(' (parameter) (','parameter)* ')';


return_Rule:  'return' ((expression';')|function_call';' ) ;
else_rule:('else'  '{'statement+ '}');
if_Rule: 'if' '(' expression')' '{'(statement)*  '}' else_rule?;
while_Rule:'while' '(' expression ')' '{'(statement)* '}';
for_Rule:'for' '(' expression';'expression';'expression')' '{'statement*'}' ;
break_Rule:'break';
continue_Rule:'continue';
statement_rules:(if_Rule|while_Rule|for_Rule|break_Rule|continue_Rule|(expression)+|function_call);

statement:statement_rules+;

cool:(function+|mainFunction)* ;
