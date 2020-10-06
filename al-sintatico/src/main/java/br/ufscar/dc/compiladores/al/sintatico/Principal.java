package br.ufscar.dc.compiladores.al.sintatico;

import br.ufscar.dc.compiladores.al.sintatico.AlParser.ProgramaContext;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal {
    public static void main(String args[]) {
        CharStream cs;
        try {
            cs = CharStreams.fromFileName(args[0]);
            AlLexer lex = new AlLexer(cs);
            
            // ESCREVE A SAIDA DO ANALISADOR LEXICO
            FileWriter myWriter = new FileWriter(args[1]);
            Token t = null;
            
            //Iniciando e executando o analisador sintatico
            CommonTokenStream tokens = new CommonTokenStream(lex);
            AlParser parser = new AlParser(tokens);
            //classe de erro customizada
            //recebe o caminho para os arquivos de saída
            ErrorListener errorListener = new ErrorListener(args[1], lex);
            parser.addErrorListener(errorListener);
            
            // ANALISADOR SEMANTICO
            ProgramaContext arvore = parser.programa();
            AlSemantico as = new AlSemantico();
            as.visitPrograma(arvore);  // TODO: sobrescrever o VisitPrograma de classe AlSemantico
            
            //Escrevendo erros na saída do compilador
            AlSemanticoUtils.errosSemanticos.forEach((msg) -> {
                try {
                    myWriter.write(msg);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            
            
            
            // essa variável será usada para parar o loop em caso de erro
            //SAIDA DO ANALISADOR LEXICO
            /* boolean error = false;
            
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
                    else if( "algoritmo".equals(t.getText()) ||
                            "fim_algoritmo".equals(t.getText()) ||
                            "declare".equals(t.getText()) ||
                            "constante".equals(t.getText()) ||
                            "tipo".equals(t.getText()) ||
                            "literal".equals(t.getText()) ||
                            "inteiro".equals(t.getText()) ||
                            "real".equals(t.getText()) ||
                            "logico".equals(t.getText()) ||
                            "verdadeiro".equals(t.getText()) ||
                            "falso".equals(t.getText()) ||
                            "registro".equals(t.getText()) ||
                            "fim_registro".equals(t.getText()) ||
                            "procedimento".equals(t.getText()) ||
                            "fim_procedimento".equals(t.getText()) ||
                            "funcao".equals(t.getText()) ||
                            "fim_funcao".equals(t.getText()) ||
                            "var".equals(t.getText()) ||
                            "leia".equals(t.getText()) ||
                            "escreva".equals(t.getText()) ||
                            "entao".equals(t.getText()) ||
                            "senao".equals(t.getText()) ||
                            "fim_se".equals(t.getText()) ||
                            "caso".equals(t.getText()) ||
                            "seja".equals(t.getText()) ||
                            "fim_caso".equals(t.getText()) ||
                            "para".equals(t.getText()) ||
                            "enquanto".equals(t.getText()) ||
                            "fim_enquanto".equals(t.getText()) ||
                            "retorne".equals(t.getText()) ||
                            "nao".equals(t.getText()) ||
                            "..".equals(t.getText()) ||
                            ":".equals(t.getText()) ||
                            "^".equals(t.getText()) ||
                            "+".equals(t.getText()) ||
                            "-".equals(t.getText()) ||
                            "*".equals(t.getText()) ||
                            "/".equals(t.getText()) ||
                            "%".equals(t.getText()) ||
                            "&".equals(t.getText()) ||
                            "ou".equals(t.getText()) ||
                            "e".equals(t.getText()) ||
                            ">".equals(t.getText()) ||
                            ">=".equals(t.getText()) ||
                            "<".equals(t.getText()) ||
                            "<=".equals(t.getText()) ||
                            "<>".equals(t.getText()) ||
                            "=".equals(t.getText()) ||
                            "(".equals(t.getText()) ||
                            ")".equals(t.getText()) ||
                            ".".equals(t.getText()) ||
                            ",".equals(t.getText()) ||
                            "[".equals(t.getText()) ||
                            "]".equals(t.getText()) 
                            ) {
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
            }*/
        } 
        
        catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}