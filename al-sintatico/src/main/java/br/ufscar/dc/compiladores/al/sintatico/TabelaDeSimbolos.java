package br.ufscar.dc.compiladores.al.sintatico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TabelaDeSimbolos {
    
    public enum TipoAl {
        CADEIA,
        INTEIRO,
        REAL,
        INVALIDO,
        BOOL
    }
    
    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;
    
    
    public TabelaDeSimbolos() {
        this.tabelaDeSimbolos = new HashMap<>();
    }
    
    class EntradaTabelaDeSimbolos {

        public String nome;
        public TipoAl tipo;

        public EntradaTabelaDeSimbolos(String nome, TipoAl tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }


    public void inserir(String nome, TipoAl tipo) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(nome, tipo);
        this.tabelaDeSimbolos.put(nome, etds);
    }
    
    public boolean existe(String nome) {
        return tabelaDeSimbolos.containsKey(nome);
    }

    public void inserirLista(List<String> nomes, TipoAl tipo) {
        for (String s : nomes) {
            tabelaDeSimbolos.put(s, new EntradaTabelaDeSimbolos(s, tipo));
        }
    }
    
    public TipoAl verificar(String nome) {
        return tabelaDeSimbolos.get(nome).tipo;
    }

}