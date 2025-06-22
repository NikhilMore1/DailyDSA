package Numbers;

import java.util.Scanner;

public class HarshadNo {
    public static boolean Harshad(int num){
        int dummy = num;
        int sum = 0;
        while (num>0){
            int rem = num%10;
            sum = sum*10+rem;
            num = num/10;

        }
        int sum1 = 0;
        while (sum>0){
            int rem = sum%10;
            sum1 = sum1*10+rem;
            sum = sum/10;
        }

        System.out.println(sum1);
        if(dummy%sum1 == 0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no");
        int num = sc.nextInt();
        System.out.println(Harshad(num));
    }
}
