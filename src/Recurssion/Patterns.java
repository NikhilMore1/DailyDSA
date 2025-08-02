package Recurssion;

import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,1};
        selection(arr,arr.length-1,0);
    }
    public static void check(int[] arr,int r,int c){
        if(r == 0){
            return;
        }
        if (c<r){
            if (arr[c+1]<arr[c]){
                int temp = arr[c+1];
                arr[c+1] = arr[c];
                arr[c] = temp;
            }
            check(arr,r,c+1);
        }else {
            check(arr,r-1,0);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr,int r, int c){
        if(r==0){
            return;
        }
        int max = 0;
        int pos = 0;
        if (c<r){
            if (arr[c]>max){
                max = arr[c];
                pos = c;
            }
            check(arr,r,c+1);
        }else {
            int temp = arr[r-1];
            arr[r-1] = max;
            arr[pos] = temp;
            System.out.println();
            check(arr,r-1,0);

        }
        System.out.println(Arrays.toString(arr));
    }
}