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
        ArrayList<Object> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        ArrayList<Object> b1 = new ArrayList<>();
        b1.add(1);
        b1.add(2);
        ArrayList<Object> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        ArrayList<Object> b2 = new ArrayList<>();
        b2.add(1);
        b2.add(2);
        ArrayList<Object> a3 = new ArrayList<>();
        a3.add(1);
        a3.add(2);
        a3.add(3);
        ArrayList<Object> a4 = new ArrayList<>();
        a4.add(1);
        a4.add(2);
        a4.add(3);
        a4.add(4);
        a4.add(5);

b.addAll(a);
ArrayList<Object> c = new ArrayList<>();
c = b;
for(Object obj : c) {
System.out.println(obj); }
for(Object obj : a1){
if(!b1.contains(obj))
b1.add(obj);
}
ArrayList<Object> d = new ArrayList<>();
d = b1;
for(Object obj : d) {
System.out.println(obj); }
ArrayList<Object> tmp = new ArrayList<>();
for(Object obj : b2){
if(a2.contains(obj))
tmp.add(obj);
}
b2= tmp;
ArrayList<Object> e = new ArrayList<>();
e = b2;
for(Object obj : e) {
System.out.println(obj); }
ArrayList<Object> f = new ArrayList<>();
ArrayList<Object> tmpRev = new ArrayList<>();
for(int i = 0 ; i < a3.size() ; i++){
tmpRev.add(i, a3.get(a3.size()-i-1));
}
f = tmpRev;
for(Object obj : f) {
System.out.println(obj); }
ArrayList<Object> h = new ArrayList<>();
h.add(a4.get(2));
for(Object obj : h) {
System.out.println(obj); }
ArrayList<Object> i = new ArrayList<>();
i = new ArrayList<Object>(a4.subList(2,5));
for(Object obj : i) {
System.out.println(obj); }

    }
}