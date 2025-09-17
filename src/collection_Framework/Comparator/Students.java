package collection_Framework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Students {
    private String name;
    private Integer roll;
    private String mail;

    Students(){

    }
    Students(String name,Integer roll,String mail){
        this.name = name;
        this.roll = roll;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public Integer getRoll() {
        return roll;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", mail='" + mail + '\'' +
                '}';
    }
    Comparator<Students> SortByName = new Comparator<Students>() {
        @Override
        public int compare(Students o1,Students o2){
            return o1.getName().compareTo(o2.getName());
        }
    };
    Comparator<Students> SortByRoll = new Comparator<Students>() {
        @Override
        public int compare(Students o1,Students o2){
            return  o1.getRoll().compareTo(o1.getRoll());
        }
    };
    public static void main(String[] args) {

        List<Students> list = new ArrayList<>();
        list.add(new Students("Nikhil",123,"moren9817@gmail.com"));
        list.add(new Students("Aniruth",234,"ani918@gmail.com"));
        list.add(new Students("Aditya",990,"aditya@gmail.com"));
        list.add(new Students("Yash",223,"yash@gmail.com"));
        Collections.sort(list,(s1,s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println(list);
    }
}
