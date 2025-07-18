package Amazon.Arrays;

public class LongestSentence
{
    public static void main(String[] args){
        String str = "Hello Happy BirthDay NikhilMore ";
        System.out.println(get(str));
    }
    public static String get(String s){
        String long_Str = "";
        String[] arr = s.split(" ");
        for(int i = 0;i<arr.length;i++){
            if(arr[i].length()>long_Str.length()){
                long_Str = arr[i];
            }
        }
        return long_Str;
    }
}
