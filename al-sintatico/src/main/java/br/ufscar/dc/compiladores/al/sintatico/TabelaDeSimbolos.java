package br.ufscar.dc.compiladores.al.sintatico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TabelaDeSimbolos {
    
    public enum TipoAl {
        INTEIRO,
        LITERAL,
        REAL,
        LOGICO,
        CADEIA,
        PROCEDIMENTO,
        FUNCAO,
        INVALIDO
    }
    
    private HashMap<String, EntradaTabelaDeSimbolos> tabela;
    
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    class EntradaTabelaDeSimbolos {

        public String nome;
        public TipoAl tipo;
        public TipoAl retorno;

        public EntradaTabelaDeSimbolos(String nome, TipoAl tipo, TipoAl retorno) {
            this.nome = nome;
            this.tipo = tipo;
            this.retorno = retorno;
        }
    }

    public void inserir(String nome, TipoAl tipo, TipoAl retorno) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(nome, tipo, retorno);
        tabela.put(nome, etds);
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoAl verificar(String nome) {
        return tabela.get(nome).tipo;
    }

}