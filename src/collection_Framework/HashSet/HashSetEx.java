package collection_Framework.HashSet;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx {
    int id;
    String name;
    HashSetEx(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof HashSetEx)){
            return false;
        }
        HashSetEx obj = (HashSetEx) o;
        if ((this.id == obj.id) && (Objects.equals(this.name,obj.name))){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "id "+id+" name "+name;
    }
    @Override
    public int hashCode(){
        Objects.hash(name);
        return Integer.hashCode(name.hashCode());
    }
    public static void main(String[] args) {
        HashSet<HashSetEx> set = new HashSet<>();
        HashSetEx m1 = new HashSetEx(1,"Z");
        HashSetEx m2 = new HashSetEx(2,"A");
        HashSetEx m3 = new HashSetEx(2,"A");
        HashSetEx m4 = new HashSetEx(1,"C");
        System.out.println(m1.equals(m3));
        System.out.println(m1.hashCode());
        System.out.println(m3.hashCode());
        Integer a = 1000;
        int hash = a.hashCode();
        System.out.println(m1.equals(m3));
        System.out.println(System.identityHashCode(m1));
        System.out.println(Objects.hashCode(m1));
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        System.out.println(set);
    }
}
