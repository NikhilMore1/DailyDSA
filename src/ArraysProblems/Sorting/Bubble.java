package ArraysProblems.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr ={1,25,6,7,8,9,5,3,5,7,8,43,322,2,2};

        for (int i= 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
