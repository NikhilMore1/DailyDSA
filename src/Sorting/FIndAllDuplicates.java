package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FIndAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,4,9,8,7,6,7,9,1,2,5,4,7,5};
        System.out.println(get(arr));
    }
    public static ArrayList<Integer> get(int[] arr){
        ArrayList<Integer>arrayList = new ArrayList<>();
        int i = 0;
        while (i<arr.length){
            int corr = arr[i]-1;
            if(arr[i]!=arr[corr]){
                swap(arr,i,corr);
            }else {
                i++;
            }
        }

       for (int j  = 0;j<arr.length;j++){
           if(arr[j] !=j+1){
               arrayList.add(arr[j]);
           }
       }
       return arrayList;
    }
    public static void swap(int[] arr,int f,int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

}
