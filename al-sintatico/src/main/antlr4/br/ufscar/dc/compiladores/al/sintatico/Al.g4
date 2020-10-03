
grammar Al;

@lexer::members {
   public static String grupo="740951 587087 586730 619884";
   void erroLexico(String mensagem) {
      throw new ParseCancellationException(mensagem);
   }
}

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

ESTENDIDO: '^';

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

programa: declaracoes ALGORITMO corpo FIM_ALGORITMO EOF | ALGORITMO corpo FIM_ALGORITMO EOF;

declaracoes: decl_local_global*;

decl_local_global: declaracao_local | declaracao_global;

declaracao_local: DECLARE variavel |
    CONSTANTE IDENT DOIS_PONTOS tipo_basico OP_IGUAL valor_constante |
    TIPOW IDENT DOIS_PONTOS tipo ;

variavel: identificador ( VIRGULA identificador)* DOIS_PONTOS tipo;

identificador: IDENT (PONTO IDENT)* dimensao ;

dimensao: (ABRE_COLCHETE exp_aritmetica FECHA_COLCHETE)* ;

tipo: registro | tipo_estendido ;

tipo_basico: LITERAL | INTEIRO | REAL | LOGICO ;

tipo_basico_ident: tipo_basico | IDENT ;

tipo_estendido: ESTENDIDO? tipo_basico_ident ;

valor_constante: CADEIA | NUM_INT | NUM_REAL | VERDADEIRO | FALSO ;

registro: REGISTROW variavel* FIM_REGISTRO ;

declaracao_global: PROCEDIMENTO IDENT ABRE_PARENTESE parametros? FECHA_PARENTESE declaracao_local* cmd* FIM_PROCEDIMENTO
                  | FUNCAO IDENT ABRE_PARENTESE parametros? FECHA_PARENTESE DOIS_PONTOS tipo_estendido declaracao_local*
                   cmd* FIM_FUNCAO;

parametro: VAR? identificador (VIRGULA identificador)* DOIS_PONTOS tipo_estendido;

parametros: parametro (VIRGULA parametro)*;

corpo: declaracao_local* cmd*;

cmd: cmd_leia | cmd_escreva| cmd_se | cmd_caso | cmd_para | cmd_enquanto |
     cmd_faca | cmd_atribuicao | cmd_chamada | cmd_retorne;

cmd_leia: LEIA ABRE_PARENTESE ESTENDIDO? identificador (VIRGULA ESTENDIDO? identificador)* FECHA_PARENTESE;

cmd_escreva: ESCREVA ABRE_PARENTESE expressao (VIRGULA expressao)* FECHA_PARENTESE;

cmd_se: SE expressao ENTAO cmd* (SENAO cmd*)? FIM_SE;

cmd_caso: CASO exp_aritmetica SEJA selecao (SENAO cmd)? FIM_CASO;

cmd_para: PARA IDENT SETA exp_aritmetica ATE exp_aritmetica FACA cmd* FIM_PARA;

cmd_enquanto: ENQUANTO expressao FACA cmd* FIM_ENQUANTO;

cmd_faca: FACA cmd* ATE expressao;

cmd_atribuicao: ESTENDIDO? identificador SETA expressao;

cmd_chamada: IDENT ABRE_PARENTESE expressao (VIRGULA expressao)* FECHA_PARENTESE;

cmd_retorne: RETORNE expressao;

selecao: item_selecao*;

item_selecao: constantes DOIS_PONTOS cmd*;

constantes: numero_intervalo (VIRGULA numero_intervalo)*;

numero_intervalo: op_unario? NUM_INT (PONTOS op_unario? NUM_INT)?;

op_unario: OP_MENOS;

exp_aritmetica: termo (op1 termo)*;

termo: fator (op2 fator)*;

fator: parcela (op3 parcela)*;

op1: OP_MAIS | OP_MENOS;

op2: OP_MUL | OP_DIV;

op3: OP_PORCENTAGEM;

parcela: op_unario? parcela_unario | parcela_nao_unario;

parcela_unario: ESTENDIDO? identificador |
                IDENT ABRE_PARENTESE expressao (VIRGULA expressao)* FECHA_PARENTESE |
                NUM_INT |
                NUM_REAL |
                ABRE_PARENTESE expressao FECHA_PARENTESE;

parcela_nao_unario: OP_E_COMERCIAL identificador | CADEIA;

exp_relacional: exp_aritmetica (op_relacional exp_aritmetica)?;

op_relacional: OP_IGUAL | OP_DIFERENTE | OP_MAIOR_IGUAL | OP_MENOR_IGUAL | OP_MAIOR | OP_MENOR;

expressao: termo_logico (op_logico_1 termo_logico)*;

termo_logico: fator_logico (op_logico_2 fator_logico)*;

fator_logico: NAO? parcela_logica;

parcela_logica: ( VERDADEIRO | FALSO ) | exp_relacional;

op_logico_1: OP_OU;

op_logico_2: OP_E;
    