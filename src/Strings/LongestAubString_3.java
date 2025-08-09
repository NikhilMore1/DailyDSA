package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestAubString_3 {
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(substr(str));
    }
    public static int substr(String str){
        char[] arr = str.toCharArray();
        ArrayList<String>arrayList = new ArrayList<>();
        int id = 0;
        for (int i = 0;i<str.length();i++){
            for (int j = i+1;j<str.length();j++){
                if ((!(arr[i] == arr[j])) && (!arrayList.contains(arr[i]+""))){
                    arrayList.add(arr[i]+"");
                   break;
                }else {
                    i++;
                }
            }
        }
        return arrayList.size();
    }
}
