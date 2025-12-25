package EPAM.coding.Strings;

public class Anagra {
    public static boolean ana(String s1 , String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int[] count = new int[256];
        for (int i = 0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int c : count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "silent";
        String ss = "listen";
        System.out.println(ana(s,ss));
    }
}
