package collection_Framework.Comparator.Comparable;

import javax.sound.midi.MidiFileFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Tickets implements Comparable<Tickets> {
    static int defaultId = 123;
    static int defaultSeat = 99;
    String name;
    int id;
    String seatNo;
    int age;
    {
        id = defaultId++;
        seatNo = defaultSeat++ +"";
    }
    Tickets(String name,int age){
        this.name = name;
        this.age = age;
    }
    Tickets(String name){
        this.name = name;
        this.age = 0;
    }
//    Desc name sort
//    public int compareTo(Tickets t1){
//        return t1.name.compareTo(this.name);
//    }


//    Asc Name sort
//    public int compareTo(Tickets t1){
//        return this.name.compareTo(t1.name);
//    }

//    Asc seatNo sort
//    public int compareTo(Tickets t1){
//        return this.seatNo.compareTo(t1.seatNo);
//    }


//    desc seatNo sort
//    public int compareTo(Tickets t1){
//        return t1.seatNo.compareTo(this.seatNo);
//    }

//    asc id sort
//    public int compareTo(Tickets t1){
//        return this.id - t1.id;
//    }
//
//    desc id sort
//    public int compareTo(Tickets t1){
//        return t1.id - this.id;
//    }

//    Asc age sort
//    public int compareTo(Tickets t1){
//        return this.age - t1.age;
//    }

//    Desc age sort
    public int compareTo(Tickets t1){
        return t1.age - this.age;
    }


    public String toString(){
        return "id :"+id+" SeatNo : "+seatNo+" name: "+name+" age: "+age;
    }
    public static void main(String[] args) {
        ArrayList<Tickets> arr = new ArrayList<>();
        arr.add(new Tickets("Nikhil",21));
        arr.add(new Tickets("Yash",18));
        arr.add(new Tickets("Sahil",19));
        arr.add(new Tickets("Avinash",22));
        arr.add(new Tickets("Sneha",17));
        Collections.sort(arr);
        System.out.println(arr);
    }
}
