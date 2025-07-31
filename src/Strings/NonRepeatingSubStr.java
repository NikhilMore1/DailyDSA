package Strings;

public class NonRepeatingSubStr {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(getSubstring(str));
    }
    public static String getSubstring(String str){
        char[] arr = str.toCharArray();
        String s = "";
        for (int i = 0;i<arr.length;i++){
            if(!(s.contains(String.valueOf(arr[i])))){
                s = s+arr[i];
            }
        }
        return  s;
    }
}
