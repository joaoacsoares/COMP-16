package data;

/**
 * Created by Joao on 22/05/2016.
 */
public class DSLOperation {
    private int line;
    private String type;
    private String[] vars;

    public DSLOperation(int l, String t , String[] vars)
    {
        this.line = l;
        this.type = t;
        this.vars = vars;
    }

    public DSLOperation(int l, String t , String vars)
    {
        this.line = l;
        this.type = t;
        this.vars = new String[1];
        this.vars[0] = vars;
    }

    public String getType()
    {
        return type;
    }
    public int getLine()
    {
        return line;
    }

    public String[] getVars()
    {
        return vars;
    }

    public void print ()
    {
        System.out.print("operation " + type + " at line " + line + " with vars:");
        for(String b : vars)
        {
            System.out.print(" " + b);
        }
        System.out.println();
    }

}
