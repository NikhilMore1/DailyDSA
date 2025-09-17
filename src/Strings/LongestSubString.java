package Strings;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcabcabcdabsjhitehdherorewrr";
        System.out.println(longestSub(str));
    }
    public static int longestSub(String str){
        Set<Integer> set = new HashSet<>();
        int max= 0 ;
        for (int i =0;i<str.length();i++){
            String sub = String.valueOf(str.charAt(i));
            for (int j = i;j<str.length();j++){
                char ch = str.charAt(j);
                if (sub.contains(String.valueOf(ch))){
                   continue;
                }else {
                    sub = sub+ch;
                    set.add(sub.length());
                }
            }
        }

        for (int ele : set){
            int temp = ele;
            if(temp>max){
                max = temp;
            }
        }

        return max;
    }
}