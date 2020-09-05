lexer grammar AlLexer;

PALAVRA_CHAVE: 'algoritmo' | 'fim_algoritmo' | 
               'var' | 'declare' | 'escreva' | ':' | 
               'funcao' | 'fim_funcao' | 'procedimento' | 'fim_procedimento' |
               'literal' | 'inteiro' | 'real' | 'logico' | 'constante' |
               'verdadeiro' | 'falso' |
               'registro' | 'fim_registro' |
               'tipo' | 
               'leia' | 'escreva' | 'se' | 'entao' | 'senao' | 'fim_se' |
               'caso' | 'seja' | 'fim_caso' | 'retorne' |
               'para' | 'ate' | 'faca' | 'fim_para' | 'ate' |
               '+' | '-' | '*' | '%' | '/' | '&' | 'ou' | 'e' | 
               '>' | '>=' | '<' | '<=' | '<>' | '=' |
               '(' | ')' | ',' | '.' | '[' | ']' |
               '<-' | '->' ;

NUM_INT: ('0'..'9')+;

NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;


IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

CADEIA: '"' (ESC_SEQ | ~('"' |'\\') )* '"';


fragment
ESC_SEQ: '\\"';

COMENTARIO: '{' ~('\n' | '\r')* '}' -> skip;

WS: ( ' ' | '\t' | '\r' | '\n') {skip();};
