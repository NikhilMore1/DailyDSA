package Sorting.Recursion_Sorting;

import java.util.Arrays;

public class Bubble_Sort_Rec {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,2,1};
//        int i = 0;
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
   public static void bubble(int[] arr,int row,int col){
        if(row == 0)
            return;
       if (col<row) {
           if (arr[col]>arr[col+1]) {
               int temp = arr[col];
               arr[col] = arr[col + 1];
               arr[col + 1] = temp;
           }
            bubble(arr,row,col+1);
        }else {
            bubble(arr,row-1,0);
        }
   }
}
