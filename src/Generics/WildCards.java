package Generics;

import java.util.ArrayList;

public class WildCards {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.set(0,11);
        arr.set(1,33);
        arr.set(2,111);
        readList(arr);
    }
    public static void readList(ArrayList<?> arr){
        for (int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public <T> T listFun(ArrayList<T> arr){
        return  arr.get(0);
    }
}
