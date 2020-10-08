package br.ufscar.dc.compiladores.al.sintatico;

import br.ufscar.dc.compiladores.al.sintatico.TabelaDeSimbolos.TipoAl;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Escopos {
    private LinkedList<TabelaDeSimbolos> escopos;
    
    public Escopos() {
        escopos = new LinkedList<>(); 
        criarNovoEscopo();
    }
    
    // Cira um escopo vazio no topo da pilha
    public void criarNovoEscopo() {
        escopos.push(new TabelaDeSimbolos());
    }
    
    // Obtem o escopo atual sem removê-lo
    public TabelaDeSimbolos obterEscopoAtual() {
        return escopos.peek();
    }
    
    // Exclui o escopo atual
    public void abandonarEscopo() {
        escopos.pop();
    }
    
    // Verifica se um simbolo existe nas tabelasDeSimbolos
    // A implementação padrão de LinkedList percorre a lista começando pelo topo
    public boolean existe(String nome) {
        for(TabelaDeSimbolos tabela: escopos) {
            if(tabela.existe(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean existeNaTabelaAtual(String nome) {
        TabelaDeSimbolos tabela = this.obterEscopoAtual();
        return tabela.existe(nome);
    }
    
    public void inserirNaTabelaAtual(String nome, TipoAl tipo) {
        TabelaDeSimbolos tabela = this.obterEscopoAtual();
        tabela.inserir(nome, tipo, null, null, null);
    }
    
    public void inserirNaTabelaAtual(String nome, TipoAl tipo, TipoAl retorno) {
        TabelaDeSimbolos tabela = this.obterEscopoAtual();
        tabela.inserir(nome, tipo, retorno, null, null);
    }
    
    public void inserirNaTabelaAtual(String nome, TipoAl tipo, TipoAl retorno, HashMap parametros, HashMap atributos) {
        TabelaDeSimbolos tabela = this.obterEscopoAtual();
        tabela.inserir(nome, tipo, retorno, parametros, atributos);
    }
    
    
    // Retorna o tipo de um simbolo
    // A implementação padrão de LinkedList percorre a lista começando pelo topo
    public TipoAl verificar(String nome) {
        for(TabelaDeSimbolos tabela: escopos) {
            return tabela.verificar(nome);
        }
        return null;
    }

    public boolean existeRegistro(String nome) {
        for(TabelaDeSimbolos tabela: escopos) {
            if(tabela.existeRegistro(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public HashMap<String, TipoAl> pegarAtributosDoRegistro(String nome){
        for(TabelaDeSimbolos tabela: escopos) {
            if(tabela.existe(nome)) {
                return tabela.pegarAtributosDoRegistro(nome);
            }
        }
        
        return null;
    }
    
    public TabelaDeSimbolos.EntradaTabelaDeSimbolos pegarEntradaDaTabela(String nome){
        for(TabelaDeSimbolos tabela: escopos) {
            if(tabela.existe(nome)) {
                return tabela.PegarEntrada(nome);
            }
        }
        return null;
    }
    
    public void imprimirTabelaAtual(){
        this.obterEscopoAtual().getTabela().entrySet().forEach(entry->{
            System.out.println("--------------------------------------");
            System.out.println(entry.getKey() + ": ");
            entry.getValue().imprime();
            System.out.println("--------------------------------------");
        });
    }
}
