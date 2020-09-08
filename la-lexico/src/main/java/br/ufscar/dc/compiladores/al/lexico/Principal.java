package br.ufscar.dc.compiladores.al.lexico;


import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;


public class Principal {
    public static void main(String args[]) {
        CharStream cs;
        try {
            cs = CharStreams.fromFileName(args[0]);
            AlLexer lex = new AlLexer(cs);
            
            // remove os manipuladores de erros padrão da classe Lexer da ANTRL
            lex.removeErrorListeners();
            
            // adicione o manipulador que criamos para lançar a excessão ParseCancellationException
            lex.addErrorListener(ErrorListener.INSTANCE);
            
            FileWriter myWriter = new FileWriter(args[1]);
            Token t = null;
            
            try {
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    if("PALAVRA_CHAVE".equals(AlLexer.VOCABULARY.getDisplayName(t.getType()))){
                        myWriter.write("<'" + t.getText() + "','" + t.getText() + "'>\n");
                        System.out.println("<'" + t.getText() + "','" + t.getText() + "'> printed");
                    }
                    else{
                        myWriter.write("<'" + t.getText() + "'," + AlLexer.VOCABULARY.getDisplayName(t.getType()) + ">\n");
                        System.out.println("<'" + t.getText() + "'," + AlLexer.VOCABULARY.getDisplayName(t.getType()) + "> printed");
                    }
                }
            } catch (ParseCancellationException e) {
                myWriter.write(e.getMessage());
                System.out.println(e.getMessage() + "printed\nExecution stoped");
            } finally{
                myWriter.close();
            }
        }
        
        catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
