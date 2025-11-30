package EPAM.coding.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecLarge {
    public static boolean check(List<Integer>arr){
        int left = 0;
        int right = arr.size()-1;
        while (left<right){
            if (! arr.get(left++).equals(arr.get(right--))){
                return false;
            }
        }
        return true;
    }

    public static void rotate(ArrayList<Integer>arr,int k){
        ArrayList<Integer> t1 = new ArrayList<>();
        for (int i = 0;i<(arr.size()-k);i++){
            t1.add(arr.get(i));
        }
        ArrayList<Integer> t2 = new ArrayList<>();
        for (int i = (arr.size()-k);i<arr.size();i++) {
            t2.add(arr.get(i));
        }
        t2.addAll(t1);
        System.out.println(t2);
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,21,3,2,1);
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        rotate(a,2);
    }
}
