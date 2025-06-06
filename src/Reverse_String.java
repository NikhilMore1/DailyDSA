import java.util.Scanner;

public class Reverse_String
{
    public static char[] reverse_str(char[] s){
        int left = 0;
        int right = s.length-1;
        while (left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }

    public static void main(String[] args) {
        char[] s = new char[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");
        for (int i=0;i<s.length;i++){
            s[i] = sc.next().charAt(0);
        }
        System.out.println(reverse_str(s));
    }
}
