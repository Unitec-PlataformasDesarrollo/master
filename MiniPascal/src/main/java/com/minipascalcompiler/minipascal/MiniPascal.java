/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.minipascalcompiler.minipascal;

/**
 *
 * @author James Josue Molina
 */
import com.minipascalcompiler.minipascal.miniPascalParser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


class VerboseListener  extends BaseErrorListener {
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
        String msg,RecognitionException e) {
        System.err.println("line "+line+":"+charPositionInLine+" "+msg);
        underlineError(recognizer,(Token)offendingSymbol,
        line, charPositionInLine);
    }
    
    protected void underlineError(Recognizer recognizer, Token offendingToken, int line,int charPositionInLine) {
        CommonTokenStream tokens = (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i=0; i<charPositionInLine; i++) System.err.print(" ");
            int start = offendingToken.getStartIndex();
            int stop = offendingToken.getStopIndex();
            if ( start>=0 && stop>=0 ) {
                for (int i=start; i<=stop; i++) System.err.print("^");
            }
        System.err.println();
    }
}


public class MiniPascal {

    static tablaSimbolos tabla = new tablaSimbolos();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input = "";
        System.out.print("Codigo: ");
        String path = sc.next();
        String fileName = path.split("/")[path.split("/").length-1];
        System.out.println(fileName);
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String linea = "";
            while( (linea = br.readLine()) != null){
                input += linea + "\n";
            }
        }catch(Exception e){
        }
        CharStream stream = new ANTLRInputStream(input);
        miniPascalLexer lexer = new miniPascalLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miniPascalParser parser = new miniPascalParser(tokens);
        // remove error listener
        parser.removeErrorListeners();
        parser.addErrorListener(new VerboseListener());
        ParseTree tree = parser.prog();
        
        MyPersonalVisitor p = new MyPersonalVisitor();
        p.tabla = tabla;
        p.visit(tree);
        String out = p.out + "    }\n}";
        String outXML = p.outXML;
        String outJSON = p.outJSON;
        
        try{
            BufferedWriter brJava = new BufferedWriter(new FileWriter("./" + fileName + "_JAVA.java"));
            brJava.write(out);
            brJava.close();
            BufferedWriter brXML= new BufferedWriter(new FileWriter("./" + fileName + "_XML.xml"));
            brXML.write(outXML);
            brXML.close();
            BufferedWriter brJSON = new BufferedWriter(new FileWriter("./" + fileName + "_JSON.json"));
            brJSON.write(outJSON);
            brJSON.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        //TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        //viewr.open();
        
       // for (fila f : tabla.getFilas()) {
//            System.out.println(f.getIdentifiador() + ": " + f.getTipo());
  //      }
    }
}
