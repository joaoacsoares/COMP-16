package data;

/**
 * Created by Joao on 22/05/2016.
 */
public class DSLVar {
    public String name;
    public String IOtype;
    public String dataType;
    private boolean used;


    public DSLVar()
    {
        
    }

    public DSLVar (String n, String t)
    {
        this.name = n;
        this.IOtype = t;
        this.dataType = "";
        this.used = false;

    }

    public DSLVar (String n, String t, String dt)
    {
        this.name = n;
        this.IOtype = t;
        this.dataType = dt;
        this.used = false;

    }

    public void markAsUsed(){
        this.used = true;
    }

    public boolean wasUsed(){
        return used;
    }

    public void print()
    {
        System.out.println("Variable " + name + " IOType : " + IOtype + " dataType: " + dataType);
    }
}
