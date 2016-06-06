ArrayList<Object> xyz= new ArrayList<>();
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
