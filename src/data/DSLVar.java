package data;

/**
 * Created by Joao on 22/05/2016.
 */
public class DSLVar {
    public String name;
    public String IOtype;
    public String dataType;
    private boolean used;

    public DSLVar (String n, String t)
    {
        this.name = n;
        this.IOtype = t;
        this.dataType = "Set";
        this.used = false;

    }

    public void markAsUsed(){
        this.used = true;
    }

    public boolean wasUsed(){
        return used;
    }
}
