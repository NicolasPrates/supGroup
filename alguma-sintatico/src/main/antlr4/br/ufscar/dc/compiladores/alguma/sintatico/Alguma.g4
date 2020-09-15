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

fragment
ESC_SEQ: '\\"';

/* 
*    Toda string começa e termina com aspas e pode ter qualquer coisa que não seja
*    aspas, a menos que esta tenho um scape antecedente
*/
CADEIA: '"' (ESC_SEQ | ~('"' | '\n') )* '"';

/*
*    Cadeias não fechadas devem gerar essa token especial que imprimirá um erro
*/
CADEIA_NAO_FECHADA: '"' (ESC_SEQ | ~('"') )* '\n';


/*
*    Comentários não geram tokens e são limitados por chaves
*/
COMENTARIO: '{' ~('\n' | '\r' | '}')* '}' -> skip; 

/*
*    Comentários não fechados devem gerar essa token especial que imprimirá um erro
*/
COMENTARIO_NAO_FECHADO: '{' ~('\n' | '\r' | '}')* '\n'; 


/*
*     Números inteiros são qualquer sequência de um ou mais digitos
*/
NUM_INT: ('0'..'9')+;

/*
*     Números reais são qualquer sequência de um ou mais digitos com um ponto no meio
*/
NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;

/*
*     Evita erros ao encontrar espaços, tabs ...
*/
WS: ( ' ' | '\t' | '\r' | '\n') {skip();};

/*
*     Se todas as regras falharem então retorne um undefiened char
*/
UNDEFINED_CHAR: .;


// Analizador sintático

PROGRAMA: DECLARACOES 'algoritmo' corpo 'fim_algoritmo';

DECLARACOES: DEC_LOCAL_GLOBAL* ;

DECLARACAO_LOCAL: 'declare' VARIAVEL |
    'constante' IDENT ':' TIPO_BASICO '=' VALOR_CONSTANTE |
    'tipo' IDENT ':' tipo ;

IDENTIFICADOR: IDENT ('.' IDENT)* DIMENSAO ;

DIMENSAO: ('[' EXP_ARITMETICA ']')* ;

TIPO: REGISTRO | TIPO_ESTENDIDO ;

TIPO_BASICO: 'literal' | 'inteiro' | 'real' | 'logico' ;

TIPO_BASICO_IDENT: TIPO_BASICO | IDENT ;

TIPO_ESTENDIDO: '^'? TIPO_BASICO_IDENT ;

VALOR_CONSTANTE: CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso' ;

REGISTRO: 'registro' VARIAVEL* 'fim registro' ;

DECLARACAO_GLOBAL: 'procedimento' IDENT '(' PARAMETROS? ')' DECLARACAO_LOCAL* CMD* 'fim_procedimento' |
    | 'funcao' IDENT '(' [PARAMETROS] ')' ':' tipo estendido (declaracao local)
(cmd) 'fim funcao'
parametro - ['var''] identificador (',' identificador) ':' tipo estendido
PARAMETROS -- parametro (',' parametro)
corpo - (declaracao local) (cmd)
cmd - cmdLeia | cmdEscreva | cmdSe | emdCaso | cmdPara | cmadEnquanto
| cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne
cmdLeia - 'leio' '(' ['*'] identificador (',' ['*'] identificador) ')'
cmdEscreva - 'escreva' '(' expressao (',' expressao) ')'
cmiSe - 'se' expressao 'entao' (cmd) ['senao' (cmd)] 'fim se'

emdlaso - "caso" exp arítmetica “seja” selecao ["senao" (cmd)] "fim caso”
ecmiPara - “para” IDENT "<-" exp aritmetica “ate” exp aritmetica “faca” (cmd) “fim para”
emdEnquanto -- “enquanto” expressao “faca” (cmd) "fim enquanto”
emdfaca - “faca” (cmd) “ate” expressao
emdAtribuicao - ["*"] identificador "<-" expressao
emdChamada - IDENT “(” expressao (",” expressao) ")"
emdRetorne - “retorne” expressao
selecao - (item selecao)
item selecao - constantes ":” 4emd)
constantes -- numero intervalo (”," numero intervalo)
numero intervalo - [op unario] NUM INT [".." [op unario] NUM INT)
op unario — "="
exp.aritmetica - termo (op1 termo)
termo - fator (op2 fator)
fator - parcela (op3 parcela)
op1 = ter | ct
op2 — tar pr
op3 + "4º
parcela - [op unario] parcela unario | parcela nao unario
parcela unario -- ["*"] identificador
| IDENT “(” expressao ("," expressao) ")"
| NUM INT
| NUM REAL
| "(" expressao ")"
parcela nao unario - “&” identificador | CADEIA
exp relacional - exp aritmetica [op relacional exp aritmetica)
op relacional - "a" | "es" | tam" | test | Nor | ter
expressao - termo logico (op. logico.1 termo logico)
termo logico - fator logico (op logico 2 fator logico)
fator. logico - ["nao"] parcela. logica
parcela logica - ( “verdadeiro” | “falso” )
| exp relacíonal
op. logico 1 - “ou”
op. logico 2 - “e
    