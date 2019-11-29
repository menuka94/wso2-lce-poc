lexer grammar ModelLexer;

// Separators

SEMICOLON           : ';' ;
COLON               : ':' ;
DOT                 : '.' ;
COMMA               : ',' ;
LEFT_BRACE          : '{' ;
RIGHT_BRACE         : '}' ;

SINGLE_STRING : '\'' ~('\'')+ '\'' ;

DOUBLE_STRING : '"' ~('"')+ '"' ;


TRUE                : 'true' ;
FALSE               : 'false' ;

IDENTIFIER :   [A-Za-z0-9_-]+ ;

HTTP_LISTENER: 'httpListener';
LOG: 'log';



// http methods
GET : 'get';
POST : 'post';
PUT : 'put';
DELETE: 'delete';
OPTIONS: 'options';
HEAD : 'head';
CONNECT : 'connect';

// log levels
INFO : 'info';
WARN : 'warn';
ERROR: 'error';
