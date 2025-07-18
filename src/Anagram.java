import java.util.*;
class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s1 = sc.nextLine();
        System.out.println("Enter the String 2");
        String s2 = sc.nextLine();
        System.out.println(check(s1,s2));
    }
    public static boolean check(String s1 , String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int len = ch1.length;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.length == ch2.length){
            for(int i = 0;i<len;i++){
                if(ch1[i] == ch2[i])
                    return true;
                return false;
            }

        }
        return false;
    }
}