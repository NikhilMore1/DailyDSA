import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "I Love Java Prog Language ";
        String[] st = str.split(" ");
        for (String ele : st){
            System.out.println(getRev(ele));
        }
    }
    public static String getRev(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        int last = str.length()-1;
        while (start<last){
            char temp = arr[start];
            arr[start]= arr[last];
             arr[last] = temp;
            start++;
            last--;
        }
        return new String(arr);
    }
}
