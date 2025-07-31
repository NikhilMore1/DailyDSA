package Amazon.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArrayCountIsK {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        int target = 7;
        System.out.println(getSubArr(arr,target));
    }
    public static List<Integer> getSubArr(int[] arr, int target){
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<arr.length;i++){
            if (arr[i]== target){
                list.add(arr[i]);
            }
            int temp = 0;
            for (int j = i;j<arr.length-1;j++){
               temp = arr[j]+arr[j+1];
               if (temp == target){
                   list.add(arr[j]);
                   list.add(arr[j+1]);
               }
            }
        }
        return list;
    }
}

