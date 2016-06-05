package data;

import java.util.ArrayList;

/**
 * Created by Joao on 22/05/2016.
 */
public class DSLOperation {
    private int line;
    private String type;
    private ArrayList<DSLVar> vars = new ArrayList<DSLVar>();
    private String pOp = new String();
    private String javacode = new String();
    private String result;

    public DSLOperation(int l, String t , ArrayList<DSLVar> vars)
    {
        this.line = l;
        this.type = t;
        this.vars = vars;
        this.result = "";

    }

    public DSLOperation(int l, String t , DSLVar vars)
    {
        this.line = l;
        this.type = t;
        //this.vars =
        this.vars.add(vars);
        this.result = "";
    }

    public DSLOperation()
    {
        this.result = "";
    }

    public DSLOperation(int l,String t, ArrayList<DSLVar> vars, String tmp)
    {
        this.line = l;
        this.type = t;
        this.vars = vars;
        this.result = tmp;
    }

    public String getType()
    {
        return type;
    }
    public int getLine()
    {
        return line;
    }
    public String getpOp(){
        return pOp;
    }
    public void setpOp(String pOp){
        this.pOp = pOp;
    }
    public String getJavacode(){return javacode;}

    public ArrayList<DSLVar> getVars()
    {
        return vars;
    }

    public void print ()
    {
        //pOp = "//" + type; //+ "//" + line;

        for(DSLVar b : vars)
        {
            pOp += ("//" + b.name + "//" + type);
        }
        if(result != "")
        {
            pOp += "//$" + result;
        }
        //pOp += ("//" + type);
        pOp += "" ;
        //System.out.print(pOp);

    }

    public void processToJava(){
        String[] words = pOp.split("//");
        for(String w : words)
            System.out.println(w);
    }

}
