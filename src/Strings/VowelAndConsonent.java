package Strings;

public class VowelAndConsonent {
    public static void main(String[] args) {
        String str = "aINikhilMoreeOU";
        System.out.println(getCount(str));
    }
    public static String getCount(String str){
        int countVowel = 0;
        int countConsonent = 0;
        String myStr = str.replaceAll("[^A-Za-z]","").toLowerCase();
        char[] arr = myStr.toCharArray();
        for (int i = 0;i<arr.length;i++){
            if ((arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] =='u')){
                countVowel++;
            }else {
                countConsonent++;
            }
        }
        return "Vowels "+countVowel+" consonents "+countConsonent;
    }
}
