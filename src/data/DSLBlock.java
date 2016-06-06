package data;

import java.util.ArrayList;

/**
 * Created by Joao on 22/05/2016.
 */
public class DSLBlock {
    private int startLine;
    private int finishLine;
    private ArrayList<DSLVar> blockVariables;
    public ArrayList<DSLOperation> blockOps;




    public DSLBlock(int st, int fn) {
        this.startLine = st;
        this.finishLine = fn;
        blockVariables = new ArrayList<DSLVar>();
        blockOps = new ArrayList<DSLOperation>();
    }

    public int getStartLine() {
        return startLine;
    }

    public void addVar(DSLVar v)
    {
        blockVariables.add(v);
    }

    public boolean varNameExists(String n)
    {
        for(DSLVar v : blockVariables){
            if(v.name.equals(n)) return true;
        }
        return false;
    }

    public ArrayList<DSLVar> getBlockVariables()
    {
        return blockVariables;
    }

    public ArrayList<DSLOperation> getBlockOps()
    {
        return blockOps;
    }

    public void useVar(int index)
    {
        blockVariables.get(index).markAsUsed();
    }

    public void addOp(DSLOperation op)
    {
        blockOps.add(op);
    }

    public DSLVar getVarByName(String name)
    {

        for (DSLVar v : blockVariables
             ) {
            if(v.name.equals(name))
                return v;
        }
        return null;
    }

    public int getFinishLine()
    {
        return finishLine;
    }

    public void print() {
        System.out.println("Block starting at line: " + startLine
                + " and ending at " + finishLine );

    }

}
