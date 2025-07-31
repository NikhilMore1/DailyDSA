package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNums {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(missingNum(arr)));
    }
    public static int[] missingNum(int[] arr){
        int i = 0;
        while (i<arr.length){
            int curr = arr[i] -1;
            if (arr[i] != arr[curr]){
                swap(arr,i,curr);
            }else {
                i++;
            }
        }
        int id = 0;
        int[] arr1 = new int[arr.length];
        for (int j = 0;j<arr.length;j++){
            if (arr[j]!=j+1){
                arr1[id++] = j+1;
            }

        }
        return arr1;
    }
    public static void swap(int[] arr,int f,int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
}
