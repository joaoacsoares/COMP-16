package data;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Joao on 22/05/2016.
 */
public class DSLOperation {
    private int line;
    private ArrayList<String> types = new ArrayList<>();
    private ArrayList<DSLVar> vars = new ArrayList<>();
    private String pOp = new String();
    private String javacode = new String();

    public DSLOperation(int l, String t , ArrayList<DSLVar> vars)
    {
        this.line = l;
        this.types.add(t);
        this.vars = vars;

    }

    public DSLOperation(int l, ArrayList<String> t , ArrayList<DSLVar> vars)
    {
        this.line = l;
        this.types = t;
        this.vars = vars;

    }
    public DSLOperation()
    {

    }


    public DSLOperation(int l, String t , DSLVar vars)
    {
        this.line = l;
        this.types.add(t);
        //this.vars =
        this.vars.add(vars);
    }



    public ArrayList<String> getTypes()
    {
        return types;
    }
    public void setTypes(ArrayList<String> types)
    {
        this.types = types;
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
    public void setVars(ArrayList<DSLVar> va)
    {
        this.vars = va;
    }

    public void print ()
    {
        /*//pOp = "//" + type; //+ "//" + line;

        for(DSLVar b : vars)
        {
            pOp += ("//" + b.name + "//" + type + "//");
        }

        //pOp += ("//" + type);
        //pOp += "" ;
        //System.out.println(pOp);
*/
    }

    public void addOperation(DSLOperation op)
    {
        ArrayList<String> aux = types;
        ArrayList<DSLVar> aux1 = vars;
        aux.addAll(op.getTypes());
        aux1.addAll(op.getVars());
    }

    public void processToJava(){
        for(String t : types)
        {
            switch (t)
            {
                case "declaration":
                    javacode += "ArrayList<int> " + vars.get(0).name +";";
                    //System.out.println(javacode);
                    break;
                case ".":
                    javacode += ".";
                    //System.out.println(javacode);
                    break;
                case "+":
                    javacode += "+";
                    //System.out.println(javacode);
                    break;
                case "int":
                    javacode += "int";
                    //System.out.println(javacode);
                    break;
                case "assignment":
                    javacode += "=";
                    //System.out.println(javacode);
                    break;
                case "declAssi":
                    javacode += "decl=";
                    //System.out.println(javacode);
                    break;
                case "'":
                    javacode += "reverse";

                    //System.out.println(javacode);
                    break;

                default:
                    if(t.contains("[") && t.contains(",") && t.contains("]"))
                    {
                        javacode += "range";
                    }
                    else if (t.contains("[") && t.contains("]"))
                    {
                        javacode += "select";
                    }
                    //System.out.println(words[2]);
                    break;

            }
        }


        //System.out.println(pOp);
        /*for(String s : pOp.split("<a>"))
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
        }*/
    }

}
