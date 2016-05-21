 /**
 * Created by Mafalda on 21/05/2016.
 */

 package compiler;

import walker.*;
import grammar_gen.DSLLexer;
import grammar_gen.DSLParser;

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


public class Main {
    public static void main( String[] args) throws Exception
    {
        String inputFile = null;
        String outputFile = null;

        if(args.length > 1)
        {
            inputFile = args[0];
            outputFile = args[1];
        } else {
            System.out.println("Wrong use of program! Please try again!");
            System.exit(-1);
        }

        DSLLexer lexer = new DSLLexer( new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        DSLParser parser = new DSLParser( tokens );
        ParseTree tree = parser.dsl();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new DSLWalker(), tree );
    }
}
