package ArraysProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDup {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5,6,7,8,6,6,5};
        int[] arr1 = new int[arr.length];
        List<Integer> list  = new ArrayList<>();
        for (int i=0;i<arr.length-1;i++) {
            if (!list.contains(arr[i]))
                list.add(arr[i]);
        }
        System.out.println(list);
    }
}
