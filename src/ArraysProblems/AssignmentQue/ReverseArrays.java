package ArraysProblems.AssignmentQue;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int start = 0;
        int temp = 0;
        int last = arr.length-1;
        while (start<=last){
            temp = arr[start];
            arr[start] = arr[last];
            arr[last] =temp;
            start++;
            last--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
