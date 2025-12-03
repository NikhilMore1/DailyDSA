package EPAM.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {
    public int id;
    public String name;
    public String address;
    public long mobile;
    public String mail;
    ComparatorEx(int id,String name,String address,long mobile,String mail){
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "ComparatorEx{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                ", mail='" + mail + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<ComparatorEx> arrayList = new ArrayList<>();
        arrayList.add(new ComparatorEx(101,"Nikhil","Pune",9766979695l,"moren9818@gmail.com"));
        arrayList.add(new ComparatorEx(102,"Yash","Mumbai",9769679695l,"moren98518@gmail.com"));
        arrayList.add(new ComparatorEx(103,"Amit","Nashik",9765479695l,"moren981568@gmail.com"));
        arrayList.add(new ComparatorEx(104,"Rahul","Delhi",97555479695l,"moren98187@gmail.com"));
        System.out.println(arrayList);
        Collections.sort(arrayList,new SortByEmail());
        System.out.println(arrayList);
    }

}
