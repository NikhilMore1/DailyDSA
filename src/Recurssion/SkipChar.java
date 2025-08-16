package Recurssion;

public class SkipChar {
    public static String fun(String str,int idx,String ans){
        if(idx>=str.length()){
            return ans;
        }
        if (str.charAt(idx) != 'a'){
            ans = ans+str.charAt(idx);
        }
        return   fun(str,++idx,ans);
    }

    public static void main(String[] args) {
        String str = "bbabba";
        System.out.println(fun(str,0,""));
    }
}
