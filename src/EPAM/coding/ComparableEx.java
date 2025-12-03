package EPAM.coding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableEx implements Comparable<ComparableEx>{
    public int roll;
    public String name;
    public  int qnt;
    ComparableEx(int roll , String name,int qnt){
        this.roll = roll;
        this.name = name;
        this.qnt = qnt;
    }
    public String toString(){
        return roll + " "+name+ " "+qnt;
    }

    @Override
    public int compareTo(ComparableEx o) {
        if (this.roll>o.roll){
            return 1;
        } else if (this.roll<o.roll) {
            return -1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<ComparableEx> arrayList = new ArrayList<>();
        arrayList.add(new ComparableEx(101,"Nikhil",100));
        arrayList.add(new ComparableEx(12,"yash",200));
        arrayList.add(new ComparableEx(13,"Amit",203));
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
