package Strings;

import java.util.Arrays;

public class StringWordRev {
    public static void main(String[] args) {
        String str = "Hello Nikhil this is Java";
        System.out.println(Arrays.toString(getRev(str)));
    }
    public static String[] getRev(String str){
        String[] arr = str.split(" ");
        int id = 0;
        String[] ans = new String[arr.length];
        for (int i = arr.length-1;i>=0;i--){
            ans[id++] = rev(arr[i]);
        }
        return ans;
    }
    public static String rev(String str){
        char[] arr = str.toCharArray();
        int f = 0;
        int l = str.length()-1;
        while (f<l){
            char temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
        return new String(arr);
    }
}
