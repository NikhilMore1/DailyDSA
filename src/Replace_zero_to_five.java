import java.util.Scanner;

public class Replace_zero_to_five {
//    public static int fun1(int n){
//        int dummy = n;
//        int sum= 0;
//        while (n>0){
//            int rem = n%10;
//            sum = sum * 10 +rem;
//            n = n/10;
//        }
//        return sum;
//    }
public static int fun1(int n){
    int sum = 0;
    while (n>0){
        int rem = n%10;
        if(rem == 0)
            rem =5 ;
        sum = sum*10+rem;
        n = n/10;
    }
    int sum1 = 0;
    while (sum>0){
        int rem1 = sum%10;
        sum1 = sum1*10+rem1;
        sum = sum/10;
    }
    return sum1;
}
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int n = new Scanner(System.in).nextInt();
        System.out.println(fun1(n));
    }
}
