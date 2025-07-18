package Sorting.Recursion_Sorting;

import java.util.Arrays;

public class Linear_Search_Rec {
    public static int liner(int[] arr,int key,int r){
        if(r>=arr.length){
            return -1;
        }
        if (arr[r] == key){
            return r;
        }
      return  liner(arr,key,r+1);
    }
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2};
        int key = 6;
       int in =  liner(arr,key,0);
        System.out.println(in);
//        System.out.println(Arrays.toString(arr));
    }
}
