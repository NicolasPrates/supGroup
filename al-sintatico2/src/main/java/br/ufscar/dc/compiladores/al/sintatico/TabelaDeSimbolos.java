package br.ufscar.dc.compiladores.al.sintatico;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {

    public boolean existeRegistro(String nome) {
        boolean exists = false;
        for (Map.Entry<String, EntradaTabelaDeSimbolos> entry : tabela.entrySet()) {
            String entrada_nome = entry.getKey();
            EntradaTabelaDeSimbolos entrada_valor = entry.getValue();
            if(entrada_nome == nome && entrada_valor.atributos != null){ 
                //nome existe na tabela de símbolos e é um registro popis tem atributos
                exists = true;
            }
        }
        return exists;
    }

    public HashMap<String, TipoAl> pegarAtributosDoRegistro(String nome) {
        HashMap<String, TipoAl> response = new HashMap<>();
        for (Map.Entry<String, EntradaTabelaDeSimbolos> entry : tabela.entrySet()) {
            String entrada_nome = entry.getKey();
            EntradaTabelaDeSimbolos entrada_valor = entry.getValue();
            if(entrada_nome == nome){ 
                response = entrada_valor.atributos;
            }
        }
        return response;
    }

    public EntradaTabelaDeSimbolos PegarEntrada(String nome) {
        return tabela.get(nome);
    }
    
    public enum TipoAl {
        INTEIRO,
        LITERAL,
        REAL,
        LOGICO,
        CADEIA,
        PROCEDIMENTO,
        FUNCAO,
        REGISTRO,
        PONTEIRO_INTEIRO,
        PONTEIRO_REAL,
        PONTEIRO_LITERAL,
        PONTEIRO_LOGICO,
        PONTEIRO_REGISTRO,
        ENDERECO_INTEIRO,
        ENDERECO_REAL,
        ENDERECO_LOGICO,
        ENDERECO_LITERAL,
        ENDERECO_REGISTRO,
        TIPO,
        INVALIDO
    }
    
    public enum tipoBasico {
        INTEIRO,
        LITERAL,
        REAL,
        LOGICO,
    }
    
    private HashMap<String, EntradaTabelaDeSimbolos> tabela;
    
    public static boolean isTipoBasico (String tipo) {
        switch (tipo) {
            case "inteiro":
                return true;
            case "literal":
                return true;
            case "real":
                return true;
            case "logico":
                return true;
            default: return false;
        }
    }
    
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

        public void imprime() {
            
            System.err.println("\tnome: "+this.nome);
            System.err.println("\ttipo: "+this.tipo.name());
            if(parametros != null){
                System.err.println("\tretorno: "+this.retorno.name());
            }
            else{
                System.err.println("\tnull");
            }
            System.err.print("\tparametros: ");
            if(parametros != null){
                this.parametros.entrySet().forEach(entry->{
                    System.out.print("\t" + entry.getKey() + "<" + entry.getValue().name()+"> ");
                });
                System.err.print("\n");
            }
            else{
                System.err.println("\tnull");
            }
            if(atributos != null){
                System.err.print("\tatributos: ");
                this.atributos.entrySet().forEach(entry->{
                    System.out.print("\t" + entry.getKey() + "<" + entry.getValue().name()+"> ");
                });
                System.err.print("\n");                
            }
             else{
                System.err.println("\tnull");
            }
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
    
    public HashMap<String, EntradaTabelaDeSimbolos> getTabela(){
        return this.tabela;
    }
}