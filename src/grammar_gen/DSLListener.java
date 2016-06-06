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
    import java.util.ArrayList;
    import java.util.Stack;

    public class DSLListener extends DSLParserBaseListener {
        private int errors;
        private DSLBlock currentBlock;
        private Stack<DSLOperation> stack = new Stack();



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
            System.out.println(b.getStartLine() + " - " + b.getFinishLine());
            this.currentBlock = b;
            Main.representation.add(b);
        }

        @Override public void exitDsl(DSLParser.DslContext ctx) {
            //ctx.getStop();
            System.out.println("Exiting DSL Mode - Semantic Analysis Complete");
            System.out.println(errors + " errors were found.");

            ArrayList<DSLOperation> tmp = currentBlock.getBlockOps();
            ArrayList<DSLOperation> tmp1 = currentBlock.getBlockOps();


            for(int i =0; i<tmp.size() ; i++)
            {
                for(int j =0; j<tmp1.size() ; j++)
                {
                    if(tmp.get(i).getLine() == tmp1.get(j).getLine() && tmp.get(i) != tmp1.get(j)) {
                        tmp.get(i).addOperation(tmp1.get(j));
                        tmp.remove(tmp1.get(j));
                        i--;

                        //tmp1.remove(op1);


                    }
                }
            }
            currentBlock.blockOps = tmp;




            for(DSLVar v : currentBlock.getBlockVariables()){
                if(!v.wasUsed()) System.out.println("Warning : Unused variable " + v.name);
            }

        }

        @Override public void enterLine(DSLParser.LineContext ctx) {
            stack.removeAllElements();

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

        @Override public void exitLine(DSLParser.LineContext ctx) {
            /*DSLOperation tmp = new DSLOperation();
            //System.out.println("Exit Line:");
            while(!stack.isEmpty()){
                tmp.setpOp(tmp.getpOp() +"<a>"+ stack.pop().getpOp()+"<a>");
            }
            //System.out.println("AUX : " + tmp.getpOp());
            currentBlock.addOp(tmp);*/
        }

        @Override public void enterDeclaration(DSLParser.DeclarationContext ctx) {
            String name, type, datatype;

            name = ctx.VAR().getText();
            type = ctx.VAR_TYPE().getText();
            DSLVar v;
            if(ctx.SET_TYPE() != null) {
                datatype = ctx.SET_TYPE().getText();
                v = new DSLVar(name,type,datatype);
            }

            else{v = new DSLVar(name,type);}


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
            DSLVar vx = null;
            for(DSLVar v : currentBlock.getBlockVariables())
            {
                if(v.name.equals(ctx.VAR().getText()))
                {
                    vx = v;
                }
            }
            if(vx != null){
                if(ctx.DSL_ASSIGN() == null) {
                    DSLOperation tmp = new DSLOperation(ctx.VAR().getSymbol().getLine(), "declaration", vx);
                    currentBlock.addOp(tmp);
                }
                else{
                    DSLOperation tmp = new DSLOperation(ctx.VAR().getSymbol().getLine(), "declAssi", vx);
                    if (ctx.SET_TYPE() != null){
                        ArrayList<String> aux = tmp.getTypes();
                        aux.add(ctx.SET_TYPE().getText());
                        tmp.setTypes(aux);
                    }
                    else if(ctx.rightSide() != null) {
                        if(ctx.rightSide().simpleOperation() != null){
                        }
                        else if(ctx.rightSide().complexOperation() != null){
                        }
                        else if(ctx.rightSide().VAR() != null){
                            ArrayList<DSLVar> aux = tmp.getVars();
                            for(DSLVar v : currentBlock.getBlockVariables())
                            {
                                if(ctx.rightSide().VAR().getText().equals(v.name))
                                {
                                    aux.add(v);
                                    break;
                                }

                            }
                            tmp.setVars(aux);

                        }
                    }
                    //tmp.print();
                    //stack.push(tmp);
                    currentBlock.addOp(tmp);
                }
            }
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
            String tmp = null;
            boolean typeChecker = false;
            for(TerminalNode n : ctx.VAR())
                {
                    for(DSLVar v : currentBlock.getBlockVariables())
                    {
                        if(n.getText().equals(v.name) && tmp == null)
                            tmp = v.dataType;
                        else if (tmp != null && n.getText().equals(v.name))
                            if (!tmp.equals(v.dataType)){
                                System.out.println("Variable type mismatch in line " + n.getSymbol().getLine());
                                errors++;
                                typeChecker = true;
                                break;
                    }


                    }
                }
            if(!typeChecker) {
                ArrayList<DSLVar> aux = new ArrayList<>();
                ArrayList<String> aux1 = new ArrayList<>();
                for (TerminalNode n : ctx.OP()) {
                    switch (n.getText()) {
                        case "'":
                            aux1.add("reverse");
                            break;

                        default:
                            if (n.getText().contains("[") && n.getText().contains(",") && n.getText().contains("]")) {
                                aux1.add("range");
                                aux1.add(n.getText());
                            } else if (n.getText().contains("[") && n.getText().contains("]")) {
                                aux1.add("select");
                                aux1.add(n.getText());
                            } else
                                aux1.add(n.getText());
                            //System.out.println(words[2]);
                            break;
                    }
                }
                for (TerminalNode n : ctx.VAR()) {
                    for (DSLVar v : currentBlock.getBlockVariables()) {
                        if (n.getText().equals(v.name))
                            aux.add(v);
                    }
                }
                DSLOperation tmp1 = new DSLOperation(ctx.OP().get(0).getSymbol().getLine(), aux1, aux);
                currentBlock.addOp(tmp1);
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

            String op = ctx.OP().getText();

            if(op.equals(".")){
                System.out.println("Concatenation misses right side var in line " + ctx.VAR().getSymbol().getLine());
                errors++;
            }
            else if(op.equals("+")){
                System.out.println("Union misses right side var in line " + ctx.VAR().getSymbol().getLine());
                errors++;
            }
            else if(op.equals("int")){
                System.out.println("Intersection misses right side var in line " + ctx.VAR().getSymbol().getLine());
                errors++;
            }
        }

        @Override public void exitSimpleOperation(DSLParser.SimpleOperationContext ctx) {
            //System.out.println("operation: line-" + ctx.OP().getSymbol().getLine() + " type-" + ctx.OP().getText() + " vars-" + ctx.VAR().getText());
            DSLVar vx = null;
            for(DSLVar v : currentBlock.getBlockVariables())
            {
                if(v.name.equals(ctx.VAR().getText()))
                {
                    vx = v;
                }
            }

            if (vx != null)
            {
                String xx = "";
                if(ctx.OP().getText().contains("[") && ctx.OP().getText().contains("]") && ctx.OP().getText().contains(",") )
                {
                    xx = "range" + ctx.OP().getText();
                }
                else if (ctx.OP().getText().contains("[") && ctx.OP().getText().contains("]"))
                {
                    xx = "select" + ctx.OP().getText();
                }
                else {
                    xx = ctx.OP().getText();
                }

                DSLOperation tmp = new DSLOperation(ctx.OP().getSymbol().getLine(),xx, vx);
                currentBlock.addOp(tmp);
            }

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
            if(ctx.DSL_ASSIGN() != null) {
                String[] aux = new String[2];
                aux[0] = ctx.leftSide().VAR().getText();
                /*if (ctx.rightSide().complexOperation() != null)
                    aux[1] = ctx.rightSide().complexOperation().VAR().get(0).getText();
                else if (ctx.rightSide().simpleOperation() != null)
                    aux[1] = ctx.rightSide().simpleOperation().VAR().getText();
                else if (ctx.rightSide().VAR() != null)
                    aux[1] = ctx.rightSide().VAR().getText();*/

                ArrayList<DSLVar> aux1 = new ArrayList<>();
                DSLVar v1 = new DSLVar();

                aux1.add(v1);


                for (DSLVar v : currentBlock.getBlockVariables()) {
                    if (v.name.equals(aux[0])) {
                        if(ctx.VAR_TYPE() != null)
                        {
                            v.IOtype = ctx.VAR_TYPE().getText();
                            //System.out.println("TESTE" + ctx.VAR_TYPE().getText());
                        }
                        aux1.set(0, v);
                        v.markAsUsed();

                    }
                }


                // System.out.println(aux[0] + aux[1]);
                DSLOperation tmp = new DSLOperation(ctx.DSL_ASSIGN().getSymbol().getLine(), "assignment", aux1);
                currentBlock.addOp(tmp);
            }
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

            DSLVar vx = null;
            for(DSLVar v : currentBlock.getBlockVariables())
            {
                if(v.name.equals(ctx.VAR().getText()))
                {
                    vx = v;
                }
            }
            if(vx!=null){
                DSLOperation tmp = new DSLOperation(ctx.DUMP().getSymbol().getLine(),"print", vx);
                currentBlock.addOp(tmp);
            }


        }

        @Override public void enterEveryRule(ParserRuleContext ctx) { }

        @Override public void exitEveryRule(ParserRuleContext ctx) { }

        @Override public void visitTerminal(TerminalNode node) { }

        @Override public void visitErrorNode(ErrorNode node) { }


    }

