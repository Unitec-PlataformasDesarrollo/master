grammar miniPascal;

@header {
    package com.minipascalcompiler.minipascal;
    import com.minipascalcompiler.minipascal.tablaSimbolos;
}

options { caseInsensitive = true; } //Para que no distinga minusculas y mayusculas

type: 'integer' # integertype
|  'char' # chartype
|  'boolean' # booleantype
;

IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
BEGIN: 'begin';
END: 'end';
REPEAT: 'repeat';
UNTIL: 'until';
FOR: 'for';
TO: 'to';
VAR: 'var';
PROGRAM: 'program';
ASSIGN: ':=';
BOOL: 'true' | 'false';
OPREL: '<>' | '=' | '>' | '<' | '>=' | '<=';
AND: 'and';
OR: 'or';
READ: 'read';
WRITE: 'write';
MULS: '*' | '/' | 'div' | 'mod' ;
SUMS: '+' | '-';

ID: ([a-z_A-Z])([a-zA-Z0-9]|'_')*;
NUM: [0-9]+;
CHAR: '\'' [a-zA-Z] '\'';
CONSTSTR: '\'' .*? '\'';


MULTICOMMENT: '{' .*? '}' -> skip;
SINGLECOMMENT: '//' .*? '\r'? '\n' -> skip;
SPACE: (' ' | '\t' | '\r' | '\n') -> skip;
SEMICOLON: ';';
COLON: ':';
COMMA: ',';
DOT: '.';
LPAREN: '(';
RPAREN: ')';


assign: ID ASSIGN op
;

prog: header EOF;

header: PROGRAM ID SEMICOLON var BEGIN sentence END DOT
;

sentence: ( sentence_t SEMICOLON )* # sentence_primero
| sentence_t # sentencesincoma
;
sentence_t: read
| write
| bif
| bwhile
| bfor
| repeat
| assign
;

sentenceUnica: sentence_t | sentence_t SEMICOLON ;

read: READ LPAREN ID RPAREN ;

write: WRITE LPAREN CONSTSTR COMMA op RPAREN 
| WRITE LPAREN CONSTSTR RPAREN ;


op: op SUMS op_t 
| op_t
;
op_t: op_t MULS op_f
| op_f
;
op_f: LPAREN op RPAREN
| SUMS op
| ID | NUM | BOOL | CHAR
;

exp: exp OR exp_t
| exp_t
;
exp_t: exp_t AND exp_f
| exp_f
;
exp_f: LPAREN exp RPAREN
| op OPREL op
| op
;


bwhile: WHILE exp THEN sentenceUnica
| WHILE exp THEN BEGIN sentence END
;

bif: bbif belse | bbif
;

bbif: IF exp THEN sentenceUnica
| IF exp THEN BEGIN sentence END
;

belse: ELSE sentenceUnica
| ELSE BEGIN sentence END
;

repeat: REPEAT sentence UNTIL exp
;

bfor: FOR ID ASSIGN NUM TO NUM DO sentenceUnica
| FOR ID ASSIGN NUM TO NUM DO BEGIN sentence END
;

var: VAR vars
;

vars: bid COLON type SEMICOLON
| bid COLON type SEMICOLON vars
;

bid: ID COMMA bid | ID
;