lexer grammar AlLexer;

/* 
*    Palavras chave serão convertidas em tokens do tipo: <'key', 'key'>
*/
PALAVRA_CHAVE: 'algoritmo' | 'fim_algoritmo' | 
               'declare' | 'constante' | 'tipo' |
               'literal' | 'inteiro' | 'real' | 'logico' |
               'verdadeiro' | 'falso' | 'registro' | 'fim_registro' |
               'procedimento' | 'fim_procedimento' | 'funcao' | 'fim_funcao' |
               'var' | 'leia' | 'escreva' | 'se' | 'entao' | 'senao' | 'fim_se' | 
               'caso' | 'seja' | 'fim_caso' | 'para' | '<-' | 'ate' | 'faca' | 'fim_para' |
               'enquanto' | 'fim_enquanto' | 'retorne' | 'nao' | '..' | ':' |
               '^' | '+' | '-' | '*' | '%' | '/' | '&' | 'ou' | 'e' | 
               '>' | '>=' | '<' | '<=' | '<>' | '=' |
               '(' | ')' | ',' | '.' | '[' | ']';

/* 
*    Todo identificador é formado apenas por letras do alfabeto (a a z), por dígitos (0 a 9) e pela sublinha (_);
*    O primeiro caractere é sempre uma letra ou a sublinha; nunca um dígito;
*    O identificador escolhido deve ser significativo. 
*/
IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

/* 
*    Toda string começa e termina com aspas e pode ter qualquer coisa que não seja
*    aspas, a menos que esta tenho um scape antecedente
*/
fragment
ESC_SEQ: '\\"';
CADEIA: '"' (ESC_SEQ | ~('"') )* '"';

/*
*    Comentários não geram tokens e são limitados por chaves
*/
COMENTARIO: '{' ~('\n' | '\r' | '}')* '}' -> skip; 


/*
*     Números inteiros são qualquer sequência de um ou mais digitos
*/
NUM_INT: ('0'..'9')+;

/*
*     Números reais são qualquer sequência de um ou mais digitos com um ponto no meio
*/
NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;

/*
*     Evita erros ao encontrar espaços, tabs e quebras de linha
*/
WS: ( ' ' | '\t' | '\r' | '\n') {skip();};