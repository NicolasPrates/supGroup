package br.ufscar.dc.compiladores.al.lexico;


import java.io.FileWriter;
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
            FileWriter myWriter = new FileWriter(args[1]);
            Token t = null;
            
            // essa variável será usada para parar o loop em caso de erro
            boolean error = false;
            try {
                while ((t = lex.nextToken()).getType() != Token.EOF && !error) {
                    
                    // essa token é gerada pela última regra da gramática que é um .
                    // isso é, reconhece qualquer caractere que não foi reconhecido antes
                    // logo podemos assumir que é um caracter que a gramática não reconhece
                    // assim podemos parar o looping e exibir o erro
                    if ("UNDEFINED_CHAR".equals(AlLexer.VOCABULARY.getDisplayName(t.getType()))){
                        myWriter.write(
                            "Linha " + 
                            t.getLine() + ": " + 
                            t.getText() +
                            " - simbolo nao identificado\n"
                        );
                        
                        // essa atribuição faz o loop parar
                        error = true;
                    }
                    
                    // se o analizador lexico identificar comentários não fechados
                    // deverá dizer isso ao programador
                    else if ("COMENTARIO_NAO_FECHADO".equals(AlLexer.VOCABULARY.getDisplayName(t.getType()))){
                        myWriter.write(
                            "Linha " + 
                            t.getLine() +
                            ": comentario nao fechado\n"
                        );
                        
                        // essa atribuição faz o loop parar
                        error = true;
                    }
                    
                    // se o analizador lexico identificar cadeias não fechadas
                    // deverá dizer isso ao programador
                    else if ("CADEIA_NAO_FECHADA".equals(AlLexer.VOCABULARY.getDisplayName(t.getType()))){
                        myWriter.write(
                            "Linha " + 
                            t.getLine() +
                            ": cadeia literal nao fechada\n"
                        );
                        
                        // essa atribuição faz o loop parar
                        error = true;
                    }
                    
                    // quando temos uma palavra chave devemos gerar um token to tipo
                    // <"valor", "valor">, esse if cuida disso
                    else if("PALAVRA_CHAVE".equals(AlLexer.VOCABULARY.getDisplayName(t.getType()))){
                        myWriter.write("<'" + t.getText() + "','" + t.getText() + "'>\n");
                    }
                    
                    // se nenhuma das condições impostas anteriormente para manipulação
                    // for verdadeira, imprima normalmente o token no arquivo
                    else{
                        myWriter.write(
                            "<'" +
                            t.getText() +
                            "'," +
                            AlLexer.VOCABULARY.getDisplayName(t.getType()) +
                            ">\n"
                        );
                    }
                }
            } 
            
            // garante que o arquiva seja fechado mesmo se houver excessão lançada
            finally{
                myWriter.close();
            }
        }
        
        catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
