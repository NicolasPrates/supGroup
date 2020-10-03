package br.ufscar.dc.compiladores.al.sintatico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.misc.Pair;

public class Escopos {
    private LinkedList<TabelaDeSimbolos> pilhaDeTabelas;
    private LinkedList<List<String>> funcoes_ou_procedimentos;
    private LinkedList<String> nomes_das_funcoes;
    private Map<String, List<Pair>> tipos;

    public Escopos() {
        pilhaDeTabelas = new LinkedList<>();
        funcoes_ou_procedimentos = new LinkedList<>();
        nomes_das_funcoes = new LinkedList<>();
        tipos = new HashMap<>();
        List<Pair> tipo_basico = new ArrayList<>();
        tipos.put("inteiro", tipo_basico);
        tipos.put("real", tipo_basico);
        tipos.put("literal", tipo_basico);
        tipos.put("logico", tipo_basico);
    }
    
    public void criarNovoEscopo(TabelaDeSimbolos tds) {
        pilhaDeTabelas.push(tds);
    }
    
    public TabelaDeSimbolos obterEscopoAtual() {
        return pilhaDeTabelas.peek();
    }
    
    public void abandonarEscopo() {
        pilhaDeTabelas.pop();
    }
    
    
    
}
