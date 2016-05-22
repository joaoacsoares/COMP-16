/**
 * Created by Mafalda on 22/05/2016.
 */

package grammar_gen;

import data.DSLVar;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiler.Main;
import data.DSLBlock;

public class DSLListener extends DSLParserBaseListener {
    private int errors;
    private int warnings;
    private DSLBlock currentBlock;



    public DSLListener() {
        errors = 0;
        warnings = 0;

    }

    public int getErrors()
    {
        return errors;
    }

    /************************************** DSL ******************************************/

    @Override public void enterDsl(DSLParser.DslContext ctx) {
        System.out.println( "Entering DSL Mode :" + ctx.DSLBEGIN().getText());

        DSLBlock b = new DSLBlock(ctx.DSLBEGIN().getSymbol().getLine(), ctx.DSLEND().getSymbol().getLine());
        this.currentBlock = b;
        Main.representation.add(b);



        //System.out.println(ctx.getText());
    }

    @Override public void exitDsl(DSLParser.DslContext ctx) {
        //ctx.getStop();
        System.out.println("Exiting DSL Mode - Semantic Analysis Complete");
        System.out.println(errors + " errors were found.");

    }

    @Override public void enterLine(DSLParser.LineContext ctx) {
       if (ctx.declaration() != null && !ctx.declaration().DSL_SEMI().getText().equals(";")){
            System.out.println("Missing semicolon (';') at the end of the line " + ctx.declaration().VAR_TYPE().getSymbol().getLine() );
            errors++;
        }
        if (ctx.dslAssignment() != null && !ctx.dslAssignment().DSL_SEMI().getText().equals(";")){
            System.out.println("Missing semicolon (';') at the end of the line " + ctx.dslAssignment().DSL_ASSIGN().getSymbol().getLine());
            errors++;
        }
        if (ctx.print() != null && !ctx.print().DSL_SEMI().getText().equals(";")){
            System.out.println("Missing semicolon (';') at the end of the line " + + ctx.print().DUMP().getSymbol().getLine());
            errors++;
        }


    }

    @Override public void exitLine(DSLParser.LineContext ctx) { }

    @Override public void enterDeclaration(DSLParser.DeclarationContext ctx) {
        String name, type;

        name = ctx.VAR().getText();
        type = ctx.VAR_TYPE().getText();

        DSLVar v = new DSLVar(name,type);

        if(currentBlock.varNameExists(name)){
            System.out.println("Variable " + name +" redeclaration " + " in line " + ctx.VAR().getSymbol().getLine());
            errors++;
        }
        else{
            currentBlock.addVar(v);
        }
    }

    @Override public void exitDeclaration(DSLParser.DeclarationContext ctx) { }

    @Override public void enterComplexOperation(DSLParser.ComplexOperationContext ctx) {

        boolean found = false;
        for(TerminalNode x : ctx.VAR()) {
            for (DSLVar v : currentBlock.getBlockVariables()) {
                if (x.getText().equals(v.name)) {
                    found = true;
                }
            }
            if(!found)
            {
                System.out.println("Undeclared variable " + x.getText() + " used in line " + x.getSymbol().getLine());
                errors++;
            }
            found = false;
        }
    }

    @Override public void exitComplexOperation(DSLParser.ComplexOperationContext ctx) { }

    @Override public void enterSimpleOperation(DSLParser.SimpleOperationContext ctx) {
        boolean found = false;
        for(DSLVar v : currentBlock.getBlockVariables())
        {
            if (ctx.VAR().getText().equals(v.name)) {
                found = true;
            }
        }

        if(!found)
        {
            System.out.println("Undeclared variable " + ctx.VAR().getText() + " used in line " + ctx.VAR().getSymbol().getLine());
            errors++;
        }
    }

    @Override public void exitSimpleOperation(DSLParser.SimpleOperationContext ctx) { }

    @Override public void enterLeftSide(DSLParser.LeftSideContext ctx) { }

    @Override public void exitLeftSide(DSLParser.LeftSideContext ctx) { }

    @Override public void enterArray(DSLParser.ArrayContext ctx) { }

    @Override public void exitArray(DSLParser.ArrayContext ctx) { }

    @Override public void enterRightSide(DSLParser.RightSideContext ctx) {


    }

    @Override public void exitRightSide(DSLParser.RightSideContext ctx) { }

    @Override public void enterDslAssignment(DSLParser.DslAssignmentContext ctx) {
        if (!ctx.DSL_ASSIGN().getText().equals("=")) {
            System.out.println("Expecting a '=' on the assigment");
            errors++;
        }
    }

    @Override public void exitDslAssignment(DSLParser.DslAssignmentContext ctx) { }

    @Override public void enterPrint(DSLParser.PrintContext ctx) {
        boolean found = false;
        for(DSLVar v : currentBlock.getBlockVariables())
        {
            if (ctx.VAR().getText().equals(v.name)) {
                found = true;
            }
        }

        if(!found)
        {
            System.out.println("Undeclared variable " + ctx.VAR().getText() + " used in line " + ctx.VAR().getSymbol().getLine() + " as a " + ctx.DUMP().getText() + " operation");
            errors++;
        }
    }

    @Override public void exitPrint(DSLParser.PrintContext ctx) { }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }
}

