package br.ufscar.dc.compiladores.al.sintatico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TabelaDeSimbolos {

    private String escopo;
    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;

    public TabelaDeSimbolos(String escopo) {
        this.tabelaDeSimbolos = new HashMap<>();
        this.escopo = escopo;
    }

    public void inserir(String nome, String tipoDado, String tipoToken) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos(nome, tipoDado, tipoToken);
        this.tabelaDeSimbolos.put(nome, etds);
    }

    public void inserirLista(List<String> nomes, String tipodado, String tipotoken) {
        for (String s : nomes) {
            tabelaDeSimbolos.put(s, new EntradaTabelaDeSimbolos(s, tipodado, tipotoken));
        }
    }

    /* public boolean existe(String nome) {
        for (EntradaTabelaDeSimbolos etds : tabelaDeSimbolos) {
            if (etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    } */

    /* @Override
    public String toString() {
        String ret = "Escopo: " + this.escopo;
        for (EntradaTabelaDeSimbolos etds : tabelaDeSimbolos) {
            ret += "\n   " + etds;
        }
        
        tabelaDeSimbolos.forEach((nome, etds) -> {
            
        });
        
        for (int i = 0; i < tabelaDeSimbolos.size(); i++) {
            ret += "\n   " + tabelaDeSimbolos.;
        }
        return ret;
    } */
    
    public EntradaTabelaDeSimbolos verificar(String nome, double valor) {
        return tabelaDeSimbolos.get(nome);
    }


    /* public String getTypeDado(String nome) {
        for (EntradaTabelaDeSimbolos etds : tabelaDeSimbolos) {
            if (etds.getNome().equals(nome)) {
                return etds.getTipodado();
            }
        }
        return null;
    } */

    //Retorna o escopo associado a tabela
    public String getType() {
        if (this.escopo.contains("funcao"))
            return "funcao";
        else if (this.escopo.contains("procedimento"))
            return "procedimento";
        return "global";
    }

    public String getName() {
        return escopo;
    }

    //Metodo adicionado para retornar o tipo de uma entrada na tabela de tabelaDeSimbolos
   /* public String getVarTipo(String nome) {
        for (EntradaTabelaDeSimbolos etds : tabelaDeSimbolos) {
            if (etds.getNome().equals(nome)) {
                return etds.getTipodado();
            }
        }
        return "false";
    } */
}