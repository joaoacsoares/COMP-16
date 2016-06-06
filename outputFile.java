ArrayList<Object> x= new ArrayList<>();
ArrayList<Object> tmpRev = new ArrayList<>();
for(int i = 0 ; i < a.size() ; i++){
tmpRev.add(i, a.get(a.size()-i-1));
}
a = tmpRev;
b.addAll(a);
for(Object obj : c){
if(!b.contains(obj))
c.add(obj);
}
ArrayList<Object> tmp = new ArrayList<>();
for(Object obj : d){
if(c.contains(obj))
tmp.add(obj);
}
d=tmp;
ArrayList<Object> e= new ArrayList<>();
e=d;
