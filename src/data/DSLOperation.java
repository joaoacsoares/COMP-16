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
            pOp += ("//" + b.name + "//" + type + "//");
        }

        //pOp += ("//" + type);
        //pOp += "" ;
        //System.out.println(pOp);

    }

    public void processToJava(){
        //System.out.println(pOp);
        for(String s : pOp.split("<a>"))
        {
            if(s.length() >1)
            {
                //System.out.println(s);
                String[] words = s.split("//");
                //System.out.println(words[2]);
                switch (words[2])
                {
                    case "declaration":
                        javacode = "ArrayList<int> " + words[1] +";";
                        //System.out.println(javacode);
                        break;
                    case ".":
                        javacode = ".";
                        //System.out.println(javacode);
                        break;
                    case "+":
                        javacode = "+";
                        //System.out.println(javacode);
                        break;
                    case "int":
                        javacode = "int";
                        //System.out.println(javacode);
                        break;
                    case "assignment":
                        javacode = "=";
                        //System.out.println(javacode);
                        break;
                    case "declAssi":
                        javacode = "decl=";
                        //System.out.println(javacode);
                        break;
                    case "'":
                        javacode = "reverse";

                        //System.out.println(javacode);
                        break;

                    default:
                        if(words[2].contains("[") && words[2].contains(",") && words[2].contains("]"))
                        {
                            javacode = "range";
                        }
                        else if (words[2].contains("[") && words[2].contains("]"))
                        {
                            javacode = "select";
                        }
                        //System.out.println(words[2]);
                        break;

                }
            }
        }
    }

}
