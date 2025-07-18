package Searching;

import java.util.Arrays;

public class Linear2D {
    public static int[] getEle(int[][] arr,int target){
        int[] arr1 = new int[2];
        for (int i =0 ;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    arr1[0] = i;
                    arr1[1] = j;
                    break;
                }
                else{
                    arr1[0] = -1;
                    arr1[1] = -1;
                }
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int[] ar = getEle(arr,15);
        System.out.println(Arrays.toString(ar));

    }
}
