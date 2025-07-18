package ArraysProblems.Assesments;

import java.util.Arrays;

public class Sec {
    public static int[][] getIndice(int[] arr,int target){
        int[][] ans = new int[2][2];
        for (int i =0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                   int[][] op = {{arr[i], i},{arr[j],j}};
                   ans = op;
                }
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 10;
        int[][] ans = getIndice(arr,target);
        System.out.println(Arrays.deepToString(ans));
    }
}