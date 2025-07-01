package ArraysProblems.AssignmentQue;

import java.util.Arrays;

public class PosAndNeg {
    public static void main(String[] args) {
        int[] arr = {-1,-2,3,4,5,6};
        for (int i =0;i<arr.length;i++){
            int temp  =0;
            if(arr[i]<0){
                for (int j = i+1;j<arr.length;j++){
                    if (arr[j]>0){
                        temp  = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
