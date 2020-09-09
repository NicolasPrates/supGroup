/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.al.lexico;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author borto
 */
public class ErrorListener extends BaseErrorListener{
    public static final ErrorListener INSTANCE = new ErrorListener();
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
      throws ParseCancellationException {
        throw new ParseCancellationException("Linha " + line + ": " + msg.substring(msg.length()-2, msg.length()-1) + " - simbolo nao identificado");
    }
}
