package Amazon.Arrays;

import java.util.Arrays;

public class ArrayIsSorted {
    public static void main(String[] args){
        int[] arr = {};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static boolean check(int[] arr){
        for (int i =0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static int[] reverse(int[] arr){
        if (arr.length ==0){
            return new int[0];
        }
        int s = 0;
        int l = arr.length-1;
        while (s<l){
            int temp = arr[s];
            arr[s] = arr[l];
            arr[l] = temp;
            s++;
            l--;
        }
        return arr;
    }
}
