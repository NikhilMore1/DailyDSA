package Strings;

public class CheckRotationString {
    public static void main(String[] args) {
        String s1 = "abc"; //abcabc
        String s2 = "acb";
        System.out.println(check(s1,s2));
    }
    public static boolean check(String s1,String s2){
        if (s1.length() != s2.length())
            return false;
        String str = s1+s1;
        if (str.contains(s2)){
            return true;
        }
        return false;
    }
}
