package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestCommonPrefix {
    public static void common(String[] arr){
        StringBuffer sb = new StringBuffer();
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        int size = Math.min(first.length(), last.length());
        for (int i =0;i<size;i++){
            if (first.charAt(i) == last.charAt(i)){
               sb.append(last.charAt(i));
            }else {
                sb.append("");
            }
        }

        System.out.println(sb);
    }
    public static void main(String[] args) {
        String[] arr = {"flower","flow","oflight","flidd","flour"};
        common(arr);
    }
}
