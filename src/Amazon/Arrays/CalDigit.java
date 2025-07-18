package Amazon.Arrays;
public class CalDigit {
    public static void main(String[] args) {
        String str = "H2ello12223";
        int n = cal(str);
        System.out.println(n);
    }

    public static int cal(String str) {
        int count = 0;
       for(int i = 0;i<str.length();i++){
           if(Character.isDigit(str.charAt(i))){
               count = count+Character.getNumericValue(str.charAt(i));
           }
       }
       return count;
    }
}
