import java.util.Scanner;

public class Reverse_Number {
    public static int rev(int n){
        int sum = 0;
        while (n>0){
            int rem = n%10;
            sum = sum*10+rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(rev(n));
    }
}
