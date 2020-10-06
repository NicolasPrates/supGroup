package br.ufscar.dc.compiladores.al.sintatico;

import br.ufscar.dc.compiladores.al.sintatico.TabelaDeSimbolos.TipoAl;
import java.util.HashMap;
import java.util.LinkedList;

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
}
