 /**
 * Created by Mafalda on 21/05/2016.
 */

 package compiler;

import data.DSLOperation;
import data.DSLVar;
import grammar_gen.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import grammar_gen.*;
import data.DSLBlock;
public class Main {
    public static ArrayList<DSLBlock> representation;
    public static void main( String[] args) throws Exception
    {
        String inputFile = null;
        String outputFile = null;

        if(args.length > 1)
        {
            inputFile = args[0];
            System.out.println(inputFile);
            outputFile = args[1];
            System.out.println(outputFile);
        } else {
            System.out.println("Wrong use of program! Please try again!");
            System.exit(-1);
        }
        //InputStream is = new FileInputStream(inputFile);


        PrintWriter pw = new PrintWriter(new File(outputFile));

        String content = new Scanner(new File(inputFile)).useDelimiter("\\Z").next();


        DSLLexer lexer = new DSLLexer( new ANTLRFileStream(inputFile));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        DSLParser parser = new DSLParser( tokens );

        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();


        representation = new ArrayList<DSLBlock>();
        DSLListener listener = new DSLListener();
        walker.walk( listener, tree );

        for(DSLBlock b : representation)
        {

            String words = content.split("/\\*@SETDSL")[0];
            content = content.replace(words,"");
            String words1 = content.split("\\*/")[0];
            content = content.replace(words1,"");
            content = content.replaceFirst("\\*/","");
            System.out.println(content);
            pw.print(words);

            //content = content - content.split("/*@SETDSL")[0];
            for(DSLOperation op : b.getBlockOps())
            {
                //op.print();
                op.processToJava();
                pw.print(op.getJavacode());
                

            }
            for(DSLVar v : b.getBlockVariables())
            {
                v.print();
            }
        }
        pw.print(content);
        pw.close();
        if(listener.getErrors() > 0)
        {
            System.out.println("There are syntax errors, on your code!");
        }

    }
}
