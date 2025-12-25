package Amazon.Arrays;

public class StringPal {
    public static void main(String[] args){
        String str = "madam";
        System.out.println(check(str));
    }
    public static boolean get(String str){
        int start = 0;
        int last = str.length()-1;
        while(start<=last){
            if(str.charAt(start) == str.charAt(last)){
                start++;
                last--;
            }else {
                return false;
            }
        }
        return true;
    }


    public static boolean check(String s){
        //using two pointers
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
