package ArraysProblems.AssignmentQue;

import java.util.Arrays;

public class One_To_twoDim {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int row = 3;
        int cols = 2;
        int[][] newArr = new int[row][cols];
        int ind = 0;
        for (int i =0;i<newArr.length;i++){
            for (int j = 0;j<newArr[i].length;j++){
                newArr[i][j] = arr[ind++];
            }
        }
        System.out.println(Arrays.deepToString(newArr));
    }
}
