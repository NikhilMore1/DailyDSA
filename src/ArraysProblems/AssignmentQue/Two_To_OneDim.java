package ArraysProblems.AssignmentQue;

import java.util.Arrays;

public class Two_To_OneDim {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int[] newArr = new int[arr.length*arr[0].length];
        int ind = 0;
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
//                System.out.println(arr[i][j]);
                newArr[ind++] = arr[i][j];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
