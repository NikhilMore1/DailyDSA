package Generics;

import java.util.ArrayList;

public  class WildCards {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        read(arrayList);
    }
    public static void read(ArrayList<? extends Number> arr){
        for (Number ele : arr){
            System.out.println(ele);
        }
    }
}