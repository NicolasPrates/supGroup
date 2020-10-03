package br.ufscar.dc.compiladores.al.sintatico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.misc.Pair;

public class Escopos {
    private LinkedList<TabelaDeSimbolos> escopos;
    private LinkedList<List<String>> funcoes_ou_procedimentos;
    private LinkedList<String> nomes_das_funcoes;
    private Map<String, List<Pair>> tipos;

    public Escopos() {
        escopos = new LinkedList<>();
        funcoes_ou_procedimentos = new LinkedList<>();
        nomes_das_funcoes = new LinkedList<>();
        tipos = new HashMap<>();
        List<Pair> tipo_basico = new ArrayList<>();
        tipos.put("inteiro", tipo_basico);
        tipos.put("real", tipo_basico);
        tipos.put("literal", tipo_basico);
        tipos.put("logico", tipo_basico);
        
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
    
    // Retorna o tipo de um simbolo
    // A implementação padrão de LinkedList percorre a lista começando pelo topo
    public TabelaDeSimbolos.TipoAl verificar(String nome) {
        for(TabelaDeSimbolos tabela: escopos) {
            return tabela.verificar(nome);
        }
        return null;
    }
}
