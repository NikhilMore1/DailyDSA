package Recurssion;

public class StringRecurssion {
    public static void main(String[] args) {
        String str = "baabcx";
        String ans = "";
         String a = getStr(str,ans,0);
        System.out.println(a);

    }
    public static String getStr(String str,String ans,int i){
        if (i>=str.length()){
            return ans;
        }
        if(!(str.charAt(i) == 'a')){
            ans = ans+str.charAt(i);
        }
        return  getStr(str,ans,++i);
    }
}
