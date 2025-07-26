package Strings;

public class PalindromString {
    public static void main(String[] args) {
        String str = "MADAM @,@ MADAM";
        System.out.println(  check(str));
    }
    public static boolean check(String str){
        char[] ans = str.toCharArray();
        char[] arr = str.toCharArray();
        int start = 0;
        int last = arr.length-1;
        while (start<last){
            if((arr[start]>=65 || arr[start]<=90) && (arr[last]>=65 || arr[last]<=90)){
                char temp = arr[start];
                arr[start] = arr[last];
                arr[last] = temp;
                start++;
                last--;
            }
        }
//        for (int i = 0;i<arr.length;i++){
//            if (arr[i] == ans[i]){
//                return true;
//            }
//            else {
//                return false;
//            }
//        }
//        return false;
    String ch1 = new String(arr);
        String ch2 = new String(ans);
        if (ch1.equals(ch2))
            return true;
        return false;
    }
}
