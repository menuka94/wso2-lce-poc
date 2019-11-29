parser grammar ModelParser;

options {
    language = Java;
    tokenVocab = ModelLexer;
}

// starting point
compilationUnit
    : name id components
    ;

name
    : DOUBLE_QUOTE NAME DOUBLE_QUOTE COLON DOUBLE_STRING COMMA
    ;


id
    : DOUBLE_QUOTE ID DOUBLE_QUOTE COLON DOUBLE_STRING COMMA
    ;

components
    :  DOUBLE_QUOTE COMPONENTS DOUBLE_QUOTE COLON array
    ;

array
    : LEFT_SQUARE_BRACKET (component (COMMA component)*)? RIGHT_SQUARE_BRACKET
    ;

component
    : LEFT_BRACE (type id properties COMMA)* RIGHT_BRACE
    ;


type
    : DOUBLE_QUOTE TYPE DOUBLE_QUOTE COLON DOUBLE_STRING COMMA
    ;

properties
    : LEFT_BRACE (property)* RIGHT_BRACE
    ;

property
    : DOUBLE_QUOTE (METHOD
                    | PATH
                    | LEVEL
                    | LOCATION
                    | USERNAME
                    | PASSWORD
                    |FILENAME) DOUBLE_QUOTE
    ;



