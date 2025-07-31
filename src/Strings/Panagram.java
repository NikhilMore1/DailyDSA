package Strings;
import java.util.HashSet;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNNOP22QRS2222THGSUVWXYZ";
        System.out.println(check(str));
    }
    public static boolean check(String str){
        Set<Character> set = new HashSet<>();
        char[] arr = str.toCharArray();
        String ans = str.replaceAll("[^A-Za-z]","");
        for (int i  =0;i<ans.length();i++){
            set.add(ans.charAt(i));
        }
        if (set.size() == 26){
            return true;
        }
        return false;
    }
}
