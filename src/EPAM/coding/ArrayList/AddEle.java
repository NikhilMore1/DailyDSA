package EPAM.coding.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AddEle {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0;i<20;i++){
            arr.add(i);
        }
        int data = 1000;
        System.out.println("Enter the index");
        int ind = new Scanner(System.in).nextInt();
        if (ind<0||ind>arr.size()){
            System.out.println("wrong index");
            return;
        }
        arr.add(0);
        for (int i = arr.size()-2;i>=ind;i--){
            arr.set(i+1,arr.get(i));
        }
        arr.set(ind,data);
        System.out.println(arr);
    }
}
