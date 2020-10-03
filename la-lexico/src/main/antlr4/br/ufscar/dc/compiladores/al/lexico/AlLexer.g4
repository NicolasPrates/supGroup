lexer grammar AlLexer;

/* 
*    Palavras chave serão convertidas em tokens do tipo: <'key', 'key'>
*/

ALGORITMO: 'algoritmo';

FIM_ALGORITMO: 'fim_algoritmo';

DECLARE: 'declare';

CONSTANTE: 'constante';

TIPOW: 'tipo';

LITERAL: 'literal';

INTEIRO: 'inteiro';

REAL: 'real';

LOGICO: 'logico';

VERDADEIRO: 'verdadeiro';

FALSO: 'falso';

REGISTROW: 'registro';

FIM_REGISTRO: 'fim_registro';

PROCEDIMENTO: 'procedimento';

FIM_PROCEDIMENTO: 'fim_procedimento';

FUNCAO: 'funcao';

FIM_FUNCAO: 'fim_funcao';

VAR: 'var';

LEIA: 'leia';

ESCREVA: 'escreva';

SE: 'se';

ENTAO: 'entao';

SENAO: 'senao';

FIM_SE: 'fim_se';

CASO: 'caso';

SEJA: 'seja';

FIM_CASO: 'fim_caso';

PARA: 'para';

SETA: '<-';

ATE: 'ate';

FACA: 'faca';

FIM_PARA: 'fim_para';

ENQUANTO: 'enquanto';

FIM_ENQUANTO: 'fim_enquanto';

RETORNE: 'retorne';

NAO: 'nao';

PONTOS:  '..';

DOIS_PONTOS: ':';

CIRCUNFLEXO: '^';

OP_MAIS: '+';

OP_MENOS: '-';

OP_MUL: '*';

OP_DIV: '/';

OP_PORCENTAGEM: '%';

OP_E_COMERCIAL: '&';

OP_OU: 'ou';

OP_E: 'e';

OP_MAIOR: '>';

OP_MENOR: '<';

OP_MAIOR_IGUAL: '>=';

OP_MENOR_IGUAL: '<=';

OP_DIFERENTE: '<>';

OP_IGUAL: '=';

ABRE_PARENTESE: '(';

FECHA_PARENTESE: ')';

VIRGULA: ',';

PONTO: '.';

ABRE_COLCHETE: '[';

FECHA_COLCHETE: ']';


/*PRIMEIRA VERSAO*/
/*PALAVRA_CHAVE: 'algoritmo' | 'fim_algoritmo' | 
               'declare' | 'constante' | 'tipo' |
               'literal' | 'inteiro' | 'real' | 'logico' |
               'verdadeiro' | 'falso' | 'registro' | 'fim_registro' |
               'procedimento' | 'fim_procedimento' | 'funcao' | 'fim_funcao' |
               'var' | 'leia' | 'escreva' | 'se' | 'entao' | 'senao' | 'fim_se' | 
               'caso' | 'seja' | 'fim_caso' | 'para' | '<-' | 'ate' | 'faca' | 'fim_para' |
               'enquanto' | 'fim_enquanto' | 'retorne' | 'nao' | '..' | ':' |
               '^' | '+' | '-' | '*' | '%' | '/' | '&' | 'ou' | 'e' | 
               '>' | '>=' | '<' | '<=' | '<>' | '=' |
               '(' | ')' | ',' | '.' | '[' | ']';*/

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
//OBS: nao funciona (descomentar o bloco para testar)*/

PROGRAMA: DECLARACOES ALGORITMO CORPO FIM_ALGORITMO;

DECLARACOES: DEC_LOCAL_GLOBAL+ ;

DEC_LOCAL_GLOBAL: DECLARACAO_LOCAL | DECLARACAO_GLOBAL;

DECLARACAO_LOCAL: DECLARE VARIAVEL |
    CONSTANTE IDENT DOIS_PONTOS TIPO_BASICO OP_IGUAL VALOR_CONSTANTE |
    TIPOW IDENT DOIS_PONTOS TIPO ;

VARIAVEL: IDENTIFICADOR ( VIRGULA IDENTIFICADOR)* DOIS_PONTOS TIPO;

IDENTIFICADOR: IDENT (PONTO IDENT)* DIMENSAO ;

DIMENSAO: (ABRE_COLCHETE EXP_ARITMETICA FECHA_COLCHETE)+ ;

TIPO: REGISTRO | TIPO_ESTENDIDO ;

TIPO_BASICO: LITERAL | INTEIRO | REAL | LOGICO ;

TIPO_BASICO_IDENT: TIPO_BASICO | IDENT ;

TIPO_ESTENDIDO: CIRCUNFLEXO? TIPO_BASICO_IDENT ;

VALOR_CONSTANTE: CADEIA | NUM_INT | NUM_REAL | VERDADEIRO | FALSO ;

REGISTRO: REGISTROW VARIAVEL* FIM_REGISTRO ;

DECLARACAO_GLOBAL: PROCEDIMENTO IDENT ABRE_PARENTESE PARAMETROS? FECHA_PARENTESE DECLARACAO_LOCAL* CMD* FIM_PROCEDIMENTO |
                  | FUNCAO IDENT ABRE_PARENTESE PARAMETROS? FECHA_PARENTESE DOIS_PONTOS TIPO_ESTENDIDO DECLARACAO_LOCAL*
                   CMD* FIM_FUNCAO;

PARAMETRO: VAR? IDENTIFICADOR (VIRGULA IDENTIFICADOR)* DOIS_PONTOS TIPO_ESTENDIDO;

PARAMETROS: PARAMETRO (VIRGULA PARAMETRO)*;

CORPO: (DECLARACAO_LOCAL* CMD*)+;

CMD: CMD_LEIA | CMD_ESCREVA| CMD_SE | CMD_CASO | CMD_PARA | CMD_ENQUANTO |
     CMD_FACA | CMD_ATRIBUICAO | CMD_CHAMADA | CMD_RETORNE;

CMD_LEIA: LEIA ABRE_PARENTESE CIRCUNFLEXO? IDENTIFICADOR (VIRGULA CIRCUNFLEXO IDENTIFICADOR)* FECHA_PARENTESE;

CMD_ESCREVA: ESCREVA ABRE_PARENTESE EXPRESSAO (VIRGULA EXPRESSAO)* FECHA_PARENTESE;

CMD_SE: SE EXPRESSAO ENTAO CMD* (SENAO CMD*)? FIM_SE;

CMD_CASO: CASO EXP_ARITMETICA SEJA SELECAO (SENAO CMD)? FIM_CASO;

CMD_PARA: PARA IDENT SETA EXP_ARITMETICA ATE EXP_ARITMETICA FACA CMD* FIM_PARA;

CMD_ENQUANTO: ENQUANTO EXPRESSAO FACA CMD* FIM_ENQUANTO;

CMD_FACA: FACA CMD* ATE EXPRESSAO;

CMD_ATRIBUICAO: CIRCUNFLEXO? IDENTIFICADOR SETA EXPRESSAO;

CMD_CHAMADA: IDENT ABRE_PARENTESE EXPRESSAO (VIRGULA EXPRESSAO)* FECHA_PARENTESE;

CMD_RETORNE: RETORNE EXPRESSAO;

SELECAO: ITEM_SELECAO+;

ITEM_SELECAO: CONSTANTES DOIS_PONTOS CMD*;

CONSTANTES: NUMERO_INTERVALO (VIRGULA NUMERO_INTERVALO)*;

NUMERO_INTERVALO: OP_UNARIO? NUM_INT (PONTOS OP_UNARIO? NUM_INT)?;

OP_UNARIO: OP_MENOS;

EXP_ARITMETICA: TERMO (OP1 TERMO)*;

TERMO: FATOR (OP2 FATOR)*;

FATOR: PARCELA (OP3 PARCELA)*;

OP1: OP_MAIS | OP_MENOS;

OP2: OP_MUL | OP_DIV;

OP3: OP_PORCENTAGEM;

PARCELA: OP_UNARIO? PARCELA_UNARIO | PARCELA_NAO_UNARIO;

PARCELA_UNARIO: CIRCUNFLEXO? IDENTIFICADOR |
                IDENT ABRE_PARENTESE EXPRESSAO (VIRGULA EXPRESSAO)* FECHA_PARENTESE |
                NUM_INT |
                NUM_REAL |
                ABRE_PARENTESE EXPRESSAO FECHA_PARENTESE;

PARCELA_NAO_UNARIO: OP_E_COMERCIAL IDENTIFICADOR | CADEIA;

EXP_RELACIONAL: EXP_ARITMETICA (OP_RElACIONAL EXP_ARITMETICA)?;

OP_RElACIONAL: OP_IGUAL | OP_DIFERENTE | OP_MAIOR_IGUAL | OP_MENOR_IGUAL | OP_MAIOR | OP_MENOR;

EXPRESSAO: TERMO_LOGICO (OP_LOGICO_1 TERMO_LOGICO)*;

TERMO_LOGICO: FATOR_LOGICO (OP_LOGICO_2 FATOR_LOGICO)*;

FATOR_LOGICO: NAO? PARCELA_LOGICA;

PARCELA_LOGICA: ( VERDADEIRO | FALSO ) | EXP_RELACIONAL;

OP_LOGICO_1: OP_OU;

OP_LOGICO_2: OP_E;
    