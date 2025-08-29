package Strings;

public class PalindromeTwoP
{
    public static void main(String[] args) {
        String str = "raceca ,2727r";
        String myStr = str.replaceAll("[^A-Za-z]","");
        System.out.println(check(myStr));
    }
    public static boolean check(String str){
        char[] arr = str.toCharArray();
        int s = 0;
        int l = arr.length-1;
        while (s<l){
            if (arr[s]!=arr[l]){
                return false;
            }else {
                s++;
                l--;
            }

        }
        return true;
    }

}
