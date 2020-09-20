/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.al.sintatico;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 *
 * @author vitor
 */
public class ErrorListener extends BaseErrorListener {
    
    public FileWriter myWriter;

    public ErrorListener(String file) {
        
        try {
            myWriter = new FileWriter(file);
        } catch (IOException ex) {
            
        }
        
    }
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        try{
            try {
                recognizer.getInputStream().consume();
                String ident = offendingSymbol.toString();
                
                //Pega somente o identificador do objeto na posicao  do vetor retornado pelo split()
                String splits[] = ident.split("'");
                ident = splits[1];
                myWriter.write("Linha " + line +": erro sintatico proximo a " + ident + "\nFim da compilacao\n" );
    
            } 
            finally{
                myWriter.close();
            } 
        } catch (IOException ex) {
            Logger.getLogger(ErrorListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }
    
    
}
