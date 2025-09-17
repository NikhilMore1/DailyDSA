package Recurssion;
public class Basics {
    public static  int factorial(int num){
        if (num<=0){
            return 0;
        }
        if (num ==1){
            return 1;
        }
        return num * factorial(num-1);
    }
    public static int sumDigit(int n,int sum){
        if (n<=0){
            return sum;
        }
        int rem = n%10;
        sum = sum+rem*10;
       return sumDigit(n/10,sum);
    }
    public static String rev(String str,int l,StringBuffer s){
        if(l==-1){
            return new String(s);
        }
        s.append(str.charAt(l));
        return rev(str,--l,s);

    }
    public static int fib(int n){
        if (n<=1){
            return n;
        }
        return fib(n-2)+fib(n-1);
    }
    public static boolean palindrome(String s,int i,int l){
        if(i>l){
            return true;
        }
        if (!(String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(l))))){
            return false;
        }
        return palindrome(s,++i,--l);
    }
    public static void main(String[] args) {
        String s = "hello";
        StringBuffer stringBuffer = new StringBuffer(s.length());
        char[] arr = new char[s.length()];
        String p = "m";
        System.out.println(palindrome(p,0,p.length()-1));
    }
}