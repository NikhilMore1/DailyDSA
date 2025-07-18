package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        selection(arr);
    }
    public static void selection(int[] arr){
        for (int i =0;i<arr.length;i++){
            int min = i;
            for (int j = i+1;j<arr.length;j++){
                if(arr[min]>arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}