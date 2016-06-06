package data;

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
    { }


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


    public void addOperation(DSLOperation op)
    {
        ArrayList<String> aux = types;
        ArrayList<DSLVar> aux1 = vars;
        aux.addAll(op.getTypes());
        aux1.addAll(op.getVars());
    }

    public void processToJava(){
        for(int i = 0 ; i<types.size();i++)
        {
            switch (types.get(i))
            {
                case "declaration":
                    if(vars.get(i).IOtype.equals("Output"))
                        javacode += "ArrayList<Object> " + vars.get(i).name + " = new ArrayList<>();\n";

                    break;

                case ".":
                    javacode +=vars.get(i+1).name + ".addAll(" + vars.get(i).name + ");\n";

                    break;

                case "+":
                    javacode += "for(Object obj : " + vars.get(i+1).name + "){\n";
                    javacode += "if(!"+vars.get(i).name+".contains(obj))\n";
                    javacode += vars.get(i+1).name+".add(obj);\n}\n";

                    break;
                case "int":
                    javacode += "ArrayList<Object> tmp = new ArrayList<>();\n";
                    javacode += "for(Object obj : " + vars.get(i+1).name + "){\n";
                    javacode += "if("+vars.get(i).name+".contains(obj))\n";
                    javacode += "tmp.add(obj);\n}\n";
                    javacode += vars.get(i+1).name +"= tmp;\n";

                    break;
                case "assignment":

                    break;

                case "declAssi":
                    if(vars.get(i+1).IOtype.equals("Output"))
                        javacode += "ArrayList<Object> " + vars.get(i+1).name + " = new ArrayList<>();\n";
                    javacode += vars.get(i+1).name + " = " + vars.get(i).name + ";\n";

                    break;
                case "'":
                    javacode += "ArrayList<Object> tmpRev = new ArrayList<>();\n";
                    javacode += "for(int i = 0 ; i < " + vars.get(i).name + ".size() ; i++){\n";
                    javacode += "tmpRev.add(i, " + vars.get(i).name + ".get(" + vars.get(i).name + ".size()-i-1));\n}\n";
                    javacode += vars.get(i+1).name + " = tmpRev;\n";

                    break;
                case "print":
                    javacode += "for(Object obj : " + vars.get(i).name + ") {\n";
                    javacode += "System.out.println(obj); }\n";
                    break;

                default:
                    if(types.get(i).contains("[") && types.get(i).contains(",") && types.get(i).contains("]"))
                    {
                        String index = types.get(i).toString().split("\\[")[1].split("\\]")[0];


                        javacode += vars.get(i).name + ".subList(" + index + ");\n";
                    }
                    else if (types.get(i).contains("[") && types.get(i).contains("]"))
                    {
                        String index = types.get(i).toString();
                        int id = Integer.parseInt(index.split("\\[")[1].split("\\]")[0]);

                        javacode += vars.get(i).name + ".get(" + id + ");\n";
                    }

                    break;

            }
        }
    }

}
