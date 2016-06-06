import java.util.*;
public class outputFile {
    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Object> b = new ArrayList<>();
        b.add(1);
        b.add(2);
ArrayList<Object> tmpRev = new ArrayList<>();
for(int i = 0 ; i < b.size() ; i++){
tmpRev.add(i, b.get(b.size()-i-1));
}
a = tmpRev;
b.addAll(a);
ArrayList<Object> c = new ArrayList<>();
c = b;
for(Object obj : c) {
System.out.println(obj); }

        for(Object i : c)
        {
            System.out.println(i);
        }


    }
}