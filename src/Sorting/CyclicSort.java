package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int i = 0;
        while (i<arr.length-1){
            int corr = arr[i]-1;
            if(arr[i] != arr[corr]){
                swap(arr,i,corr);
            }else {
                i++;
            }
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}