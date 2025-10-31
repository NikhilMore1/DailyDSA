package Amazon.Arrays;

import java.util.ArrayList;

public class LongestSubstring {
    static int maxLeng  =0 ;
    public static int getMax(String str){
        int len = 0;
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            while (arr.contains(ch)){
                arr.remove(0);
            }
            arr.add(ch);
            if (arr.size()>maxLeng){
                maxLeng = arr.size();
            }
        }
        return maxLeng;
    }

    public static void main(String[] args) {
        System.out.println(getMax("abcabcbb"));
    }
}
