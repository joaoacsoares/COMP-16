/**
 * Created by Mafalda on 22/05/2016.
 */

package grammar_gen;

import data.DSLOperation;
import data.DSLVar;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiler.Main;
import data.DSLBlock;

public class DSLListener extends DSLParserBaseListener {
    private int errors;
    private DSLBlock currentBlock;



    public DSLListener() {
        errors = 0;

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
    }

    @Override public void exitDsl(DSLParser.DslContext ctx) {
        //ctx.getStop();
        System.out.println("Exiting DSL Mode - Semantic Analysis Complete");
        System.out.println(errors + " errors were found.");

        for(DSLVar v : currentBlock.getBlockVariables()){
            if(!v.wasUsed()) System.out.println("Warning : Unused variable " + v.name);
        }

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

    @Override public void exitDeclaration(DSLParser.DeclarationContext ctx) {
        //System.out.println("operation: line-" + ctx.VAR().getSymbol().getLine() + " type-" + "declaration vars-" + ctx.VAR().getText());
        DSLOperation tmp = new DSLOperation(ctx.VAR().getSymbol().getLine(), "declaration", ctx.VAR().getText());
        currentBlock.addOp(tmp);
    }

    @Override public void enterComplexOperation(DSLParser.ComplexOperationContext ctx) {

        boolean found = false;
        for(TerminalNode x : ctx.VAR()) {
            for (DSLVar v : currentBlock.getBlockVariables()) {
                if (x.getText().equals(v.name)) {
                    found = true;
                    currentBlock.useVar(currentBlock.getBlockVariables().indexOf(v));
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

    @Override public void exitComplexOperation(DSLParser.ComplexOperationContext ctx) {

        for(int i = ctx.VAR().size()-1 ; i > 0 ; i--) {
            //System.out.println("operation: line-" + ctx.OP().get(i - 1).getSymbol().getLine() + " type-" + ctx.OP().get(i - 1).getText() + " vars- " + ctx.VAR().get(i - 1).getText() + " " + ctx.VAR().get(i).getText());
            String[] aux = new String[2];
            aux[0] = ctx.VAR().get(i - 1).getText();
            aux[1] = ctx.VAR().get(i).getText();
            DSLOperation tmp = new DSLOperation(ctx.OP().get(i - 1).getSymbol().getLine(), ctx.OP().get(i - 1).getText(), aux);
            currentBlock.addOp(tmp);
        }

    }

    @Override public void enterSimpleOperation(DSLParser.SimpleOperationContext ctx) {
        boolean found = false;
        for(DSLVar v : currentBlock.getBlockVariables())
        {
            if (ctx.VAR().getText().equals(v.name)) {
                found = true;
                currentBlock.useVar(currentBlock.getBlockVariables().indexOf(v));
            }
        }

        if(!found)
        {
            System.out.println("Undeclared variable " + ctx.VAR().getText() + " used in line " + ctx.VAR().getSymbol().getLine());
            errors++;
        }
    }

    @Override public void exitSimpleOperation(DSLParser.SimpleOperationContext ctx) {
        //System.out.println("operation: line-" + ctx.OP().getSymbol().getLine() + " type-" + ctx.OP().getText() + " vars-" + ctx.VAR().getText());
        DSLOperation tmp = new DSLOperation(ctx.OP().getSymbol().getLine(),ctx.OP().getText(), ctx.VAR().getText());
        currentBlock.addOp(tmp);
    }

    @Override public void enterLeftSide(DSLParser.LeftSideContext ctx) {
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

    @Override public void exitDslAssignment(DSLParser.DslAssignmentContext ctx) {

        String[] aux = new String[2];
        aux[0] = ctx.leftSide().VAR().getText();
        if(ctx.rightSide().complexOperation() != null)
        aux[1] = ctx.rightSide().complexOperation().VAR().get(0).getText();
        else if(ctx.rightSide().simpleOperation() != null)
            aux[1] = ctx.rightSide().simpleOperation().VAR().getText();
        else if (ctx.rightSide().VAR() != null)
            aux[1] = ctx.rightSide().VAR().getText();

       // System.out.println(aux[0] + aux[1]);
        DSLOperation tmp = new DSLOperation(ctx.DSL_ASSIGN().getSymbol().getLine(), "assignment", aux);
        currentBlock.addOp(tmp);
    }

    @Override public void enterPrint(DSLParser.PrintContext ctx) {
        boolean found = false;
        for(DSLVar v : currentBlock.getBlockVariables())
        {
            if (ctx.VAR().getText().equals(v.name)) {
                found = true;
                currentBlock.useVar(currentBlock.getBlockVariables().indexOf(v));
            }
        }

        if(!found)
        {
            System.out.println("Undeclared variable " + ctx.VAR().getText() + " used in line " + ctx.VAR().getSymbol().getLine() + " as a " + ctx.DUMP().getText() + " operation");
            errors++;
        }
    }

    @Override public void exitPrint(DSLParser.PrintContext ctx) {
        //System.out.println("operation: line-" + ctx.DUMP().getSymbol().getLine() + " type-" + "print" + " vars-" + ctx.VAR().getText());
        DSLOperation tmp = new DSLOperation(ctx.DUMP().getSymbol().getLine(),"print", ctx.VAR().getText());
        currentBlock.addOp(tmp);

    }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }
}

