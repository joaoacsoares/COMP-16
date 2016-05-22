package walker;

import grammar_gen.*;

/**
 * Created by Mafalda on 21/05/2016.
 */
public class DSLWalker extends DSLParserBaseListener {
    public void enterR(DSLParser.DslContext ctx ) {
        System.out.println( "Entering R : " + ctx.getText() );
    }

    public void exitR(DSLParser.DslContext ctx ) {
        System.out.println( "Exiting R" );
    }
}
