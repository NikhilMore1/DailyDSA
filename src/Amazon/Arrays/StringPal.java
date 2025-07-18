package Amazon.Arrays;

public class StringPal {
    public static void main(String[] args){
        String str = "maidam";
        System.out.println(get(str));
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
}
