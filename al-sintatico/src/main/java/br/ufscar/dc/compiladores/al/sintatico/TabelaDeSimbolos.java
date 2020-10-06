package br.ufscar.dc.compiladores.al.sintatico;

import java.util.HashMap;

public class TabelaDeSimbolos {
    
    public enum TipoAl {
        INTEIRO,
        LITERAL,
        REAL,
        LOGICO,
        CADEIA,
        PROCEDIMENTO,
        FUNCAO,
        REGISTRO,
        PONTEIRO,
        INVALIDO
    }
    
    private HashMap<String, EntradaTabelaDeSimbolos> tabela;
    
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    class EntradaTabelaDeSimbolos {

        public String nome;
        public TipoAl tipo;
        public HashMap<Integer, TipoAl> parametros;
        public HashMap<String, TipoAl> atributos;
        public TipoAl retorno;

        public EntradaTabelaDeSimbolos(String nome, TipoAl tipo, TipoAl retorno, HashMap parametros, HashMap atributos) {
            this.nome = nome;
            this.tipo = tipo;
            this.retorno = retorno;
            this.atributos = atributos;
            this.parametros = parametros;
        }
    }
    
    public void inserir(String nome, TipoAl tipo, TipoAl retorno, HashMap parametros, HashMap atributos) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(nome, tipo, retorno, parametros, atributos);
        tabela.put(nome, etds);
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoAl verificar(String nome) {
        return tabela.get(nome).tipo;
    }
}