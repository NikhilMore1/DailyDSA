package Strings;

import java.util.Arrays;

public class StringCompressor {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        System.out.println(getCompressor(str));
    }
    public static String getCompressor(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int count = 0;
        String s = "";
        for (int i = 0;i<arr.length;i++){
            if (s.contains(String.valueOf(arr[i]))){
                count++;
            }
            s = s+arr[i]+count;
        }
        return s;
    }
}
