package Amazon.Arrays;

import java.util.Arrays;

public class Lexicographic_Min_String {
    public static void get(String str){
        char[] arr = str.toCharArray();
        StringBuffer sb  = new StringBuffer();
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == '*'){
                if (sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
                else {
                    sb.append(arr[i]);

                }
            }

        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s = "aa*ba*";
        get(s);
    }
}
