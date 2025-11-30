package EPAM.coding.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveOcc {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        for (int i = 0;i<10;i++){
            arr.add(i);
        }
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        System.out.println("Enter the ele");
        int target = new Scanner(System.in).nextInt();
        for (int i = 0;i<arr.size();i++){
           if (arr.get(i).equals(target)){
               arr.remove(i);
               i--;
           }
        }
        System.out.println(arr);
    }
}
