package ArraysProblems.AssignmentQue;

import java.util.Arrays;

public class MoveAllZero {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,7,6,5};

        for (int i=0;i<arr.length;i++){
            int temp = 0;
            for (int j = i+1;j<arr.length;j++){
                if (arr[i] == 0 && arr[j]!=0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
