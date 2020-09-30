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
import org.antlr.v4.runtime.Token;

/**
 *
 * @author vitor
 */
public class ErrorListener extends BaseErrorListener {
    
    public FileWriter myWriter;
    public AlLexer lex;

    public ErrorListener(String file, AlLexer lex) {
        this.lex = lex;
        try {
            myWriter = new FileWriter(file);
        } catch (IOException ex) {
            
        }
        
    }
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        try{
            try {

                Token token= (Token) offendingSymbol;
                //Pega somente o identificador do objeto
                String ident = token.getText();
                
                // Tratando a saida dos erros 
                
                // Erro lexico (Undefined char)
                if(token.getType() == 68) {
                    myWriter.write("Linha " + line + ": " + ident + " - simbolo nao identificado" +"\nFim da compilacao\n");
                    return;
                }
                
                //Cadeia de literais não fechada
                if(ident.contains("\"") && !ident.endsWith("\"")) {     
                    myWriter.write("Linha " + line + ": cadeia literal nao fechada" +"\nFim da compilacao\n" );
                    return;
                } 
                
                // Comentario não fechado
                if(ident.contains("{")) {
                    myWriter.write("Linha " + line + ": comentario nao fechado" + "\nFim da compilacao\n" );
                    return;
                };
                
                // Adaptando o identificador EOF para a saida esperada eplo corretor
                if(ident.equals("<EOF>")) {
                    ident = "EOF";
                }
                
             
              
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
