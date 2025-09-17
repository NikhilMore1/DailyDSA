package collection_Framework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class sortByName implements Comparator<TicketsWithComparator>{
    @Override
    public int compare(TicketsWithComparator t1,TicketsWithComparator t2){
        return  t1.name.compareTo(t2.name);
    }
}
public class TicketsWithComparator {
    static int defaultId = 123;
    static int seatNo = 111;
    String name ;
    String seat;
    int age;
    char gender;
    int ids;
    {
        this.ids =  defaultId++;
        this.seat = seatNo++ + "";
    }
    TicketsWithComparator(){
        super();
    }
    TicketsWithComparator(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    TicketsWithComparator(String name,int age){
        this.name = name;
        this.age = age;
        this.gender = ' ';
    }
    TicketsWithComparator(String name){
        this.name = name;
        this.age = 0;
        this.gender = ' ';
    }
    @Override
    public String toString(){
        return "id : "+ids+" seat: "+seatNo+" name: "+name+" age: "+age+" gender: "+gender;
    }
    public static void main(String[] args) {
        List<TicketsWithComparator> list = new ArrayList<>();
        list.add(new TicketsWithComparator("Nikhil" ,21));
        list.add(new TicketsWithComparator("Yash",18));
        list.add(new TicketsWithComparator("Avinash",21));
        Collections.sort(list,(s1,s2)->s1.name.compareTo(s2.name));
        System.out.println(list);
    }
}
