package EPAM.coding;

import java.util.Arrays;

public class MoveZeroEnd {
    public static int[] move(int[] arr){
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == 0){
                for (int j = i;j<arr.length-1;j++){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,5,6,0,0,7,8,1,0,3,4};
        System.out.println(Arrays.toString(move(arr)));
    }
}
