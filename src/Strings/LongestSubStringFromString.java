package Strings;

import java.util.ArrayList;

public class LongestSubStringFromString {
    public static void main(String[] args) {
        String str = "ac";
        System.out.println(SubString(str));
    }
    public static boolean getReverse(String str){
        int s = 0;
        int l = str.length()-1;
        while (s<l){
            if(str.charAt(s++) != str.charAt(l--)){
                return false;
            }
        }
        return true;
    }
    public static String SubString(String str){
        int max = 0;
        String longestPalindrom = "";
        ArrayList<String> arrayList = new ArrayList<>();
        char[] arr = str.toCharArray();
        for (int i = 0;i<arr.length;i++){
            String sub;
            for (int j = i;j<arr.length;j++){
                sub = str.substring(i,j+1);
                if (getReverse(sub)){
                    if (max<sub.length()){
                        arrayList.add(sub);
                        max = sub.length();
                        longestPalindrom = sub;
                    }
                }
            }
        }
//        System.out.println(longestPalindrom);
        return longestPalindrom;
    }
}
