package ArraysProblems;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9,8,7,6,6,6};
        int temp = 0;
       for (int i =0;i<arr.length;i++){
           for (int j=1;j<arr.length-1-i;j++){
               if (arr[j]>arr[j+1]){
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
