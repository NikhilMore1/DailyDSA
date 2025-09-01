package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEg {
    String name;
    int age;
    ComparatorEg(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name "+this.name+" age "+this.age;
    }
    public static void main(String[] args) {
        List<ComparatorEg> list = new ArrayList<>();
        ComparatorEg m1 = new ComparatorEg("Nikhil",21);
        ComparatorEg m2 = new ComparatorEg("yash",18);
        ComparatorEg m3 = new ComparatorEg("Vivek",30);
        list.add(m1);
        list.add(m2);
        list.add(m3);
        Comparator<ComparatorEg> comparator = Comparator.comparing((ComparatorEg obj)->obj.age)
                .thenComparingInt(p ->p.age)
                        .thenComparing(p ->p.name);
        list.sort(comparator);
        System.out.println(list);
    }
}
