import java.util.Arrays;

public class OwnMethod {
    public static void main(String[] args) {
        String str = "a12b";
        System.out.println(toUpperCase(str));
    }
    public static String toUpperCase(String str){
        String s = "";
        char[] ch = str.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(ch[i]<48 || ch[i]>57){
                s = s+ Arrays.toString(ch).toUpperCase();
              return  s;
            }
        }
        return null;
    }
}
