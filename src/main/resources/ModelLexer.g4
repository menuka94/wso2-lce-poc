lexer grammar ModelLexer;

// Separators

SEMICOLON           : ';' ;
COLON               : ':' ;
DOT                 : '.' ;
COMMA               : ',' ;
LEFT_BRACE          : '{' ;
RIGHT_BRACE         : '}' ;
LEFT_SQUARE_BRACKET : '[' ;
RIGHT_SQUARE_BRACKET : ']' ;


SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';


SINGLE_STRING : '\'' ~('\'')+ '\'' ;
DOUBLE_STRING : '"' ~('"')+ '"' ;


TRUE                : 'true' ;
FALSE               : 'false' ;

IDENTIFIER :   [A-Za-z0-9_-]+ ;

HTTP_LISTENER: 'httpListener';
LOG: 'log';



// http methods
METHOD : 'method';
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


// fields
NAME : 'name';
ID : 'id';
COMPONENTS : 'components';

// component-level fields
TYPE: 'type';
PROPERTIES: 'properties';
PATH : 'path';
LOCATION : 'location';
LEVEL: 'level';
USERNAME: 'username';
PASSWORD: 'password';
FILENAME: 'filename';
