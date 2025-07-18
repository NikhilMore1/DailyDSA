package Amazon.Arrays;

import java.util.ArrayList;

public class LessMarksIndex {
    public static int getRoll(int[] arr) {
        int idx = 0;
        int min = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for (int i =0;i<arr.length;i++){
            if (arr[i]<min){
                sec = min;
                min = arr[i];
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,60,60,70,6000};
        int target = 30;
        System.out.println(getRoll(arr));
        }
    }
