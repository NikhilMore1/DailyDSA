package ArraysProblems;

import java.util.Arrays;

public class TripletSubArr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,60,70,80};
        int max = Integer.MIN_VALUE;
        int[][] op = new int[2][2];
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k = j+1;k<arr.length;k++){
                    if (max<arr[i]+arr[j]+arr[k]){
                        max = arr[i]+arr[j]+arr[k];
                        int[][] op1 = {{arr[i],arr[j],arr[k]},{i,j,k}};
                        op = op1;
                    }
                }
            }

        }
        System.out.println(Arrays.deepToString(op));
        System.out.println("Total max is "+max);
    }
}
