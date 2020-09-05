package br.ufscar.dc.compiladores.al.lexico;


import br.ufscar.dc.compiladores.al.lexico.AlLexer;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;


public class Principal {
    public static void main(String args[]) {
        CharStream cs;
        try {
            cs = CharStreams.fromFileName(args[0]);
            AlLexer lex = new AlLexer(cs);
            
            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                if("PALAVRA_CHAVE" == AlLexer.VOCABULARY.getDisplayName(t.getType()))
                    System.out.println("<'" + t.getText() + "','" + t.getText() + "'>");
                else 
                    System.out.println("<'" + t.getText() + "'," + AlLexer.VOCABULARY.getDisplayName(t.getType()) + ">");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }
}
