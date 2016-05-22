/**
 * Created by Mafalda on 22/05/2016.
 */

package grammar_gen;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class DSLListener extends DSLParserBaseListener {
    private int errors;
    private int warnings;


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
        //System.out.println(ctx.getText());
    }

    @Override public void exitDsl(DSLParser.DslContext ctx) {
        //ctx.getStop();
        System.out.println("Exiting DSL Mode - Semantic Analysis Complete");
        System.out.println(errors + " errors were found.");

    }

    @Override public void enterLine(DSLParser.LineContext ctx) {
       if (!ctx.declaration().DSL_SEMI().getText().equals(";")
            || !ctx.dslAssignment().DSL_SEMI().getText().equals(";")
            || !ctx.print().DSL_SEMI().getText().equals(";")) {
            System.out.println("Missing semicolon (';') at the end of the line.");
            errors++;
        }



    }

    @Override public void exitLine(DSLParser.LineContext ctx) { }

    @Override public void enterDeclaration(DSLParser.DeclarationContext ctx) { }

    @Override public void exitDeclaration(DSLParser.DeclarationContext ctx) { }

    @Override public void enterComplexOperation(DSLParser.ComplexOperationContext ctx) { }

    @Override public void exitComplexOperation(DSLParser.ComplexOperationContext ctx) { }

    @Override public void enterSimpleOperation(DSLParser.SimpleOperationContext ctx) { }

    @Override public void exitSimpleOperation(DSLParser.SimpleOperationContext ctx) { }

    @Override public void enterLeftSide(DSLParser.LeftSideContext ctx) { }

    @Override public void exitLeftSide(DSLParser.LeftSideContext ctx) { }

    @Override public void enterArray(DSLParser.ArrayContext ctx) { }

    @Override public void exitArray(DSLParser.ArrayContext ctx) { }

    @Override public void enterRightSide(DSLParser.RightSideContext ctx) { }

    @Override public void exitRightSide(DSLParser.RightSideContext ctx) { }

    @Override public void enterDslAssignment(DSLParser.DslAssignmentContext ctx) {
        if (!ctx.DSL_ASSIGN().getText().equals("=")) {
            System.out.println("Expecting a '=' on the assigment");
            errors++;
        }
    }

    @Override public void exitDslAssignment(DSLParser.DslAssignmentContext ctx) { }

    @Override public void enterPrint(DSLParser.PrintContext ctx) { }

    @Override public void exitPrint(DSLParser.PrintContext ctx) { }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) { }

    @Override public void visitErrorNode(ErrorNode node) { }
}

