package Sorting;

import java.util.Arrays;

class FindDuplicates {
    public static int findDuplicate(int[] nums) {
        int[] arr = nums.clone();
        int temp =0;
        int i =0;
        while(i<arr.length){
            int corr = arr[i]-1;
            if(arr[i]!=arr[corr]){
                swap(arr,i,corr);
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length-1;j++){
            if(arr[j] == arr[j+1]){
                temp = arr[j];
            }
            else {
                temp = arr[arr.length-1];
            }
        }
        return temp;
    }
    public static void swap(int[] arr,int f,int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,5};
        System.out.println(findDuplicate(arr));
    }
}