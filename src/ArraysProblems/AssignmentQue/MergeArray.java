package ArraysProblems.AssignmentQue;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = {4,5,6};
        int ind = 0;
        int[] fin = new int[arr.length+arr1.length];
        for (int i=0;i<arr.length;i++){
            fin[i] = arr[i];
        }
        for (int i=0;i<arr1.length;i++){
            fin[arr.length+i] = arr1[i];
        }
        System.out.println(Arrays.toString(fin));
    }
}
