package Recurssion;

public class Basics {
    public static void main(String[] args) {
        String st = "MadaM";
        System.out.println(checkRec(st,0,st.length()-1));
    }
    public static boolean checkRec(String str,int start,int last){
        boolean flag= false;
        while (start<last){
            if (str.charAt(start) == str.charAt(last)){
                flag = true;
            }else {
                flag = false;
            }
            checkRec(str,++start,--last);
        }
        return flag;
    }
}