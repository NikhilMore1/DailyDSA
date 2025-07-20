package ArraysProblems;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println(revrseNum(n));
    }
    public static int revrseNum(int n){
        int temp = n;
        int sum = 0;
        boolean isNeg = false;
         if(n<0){
             isNeg = true;
         }
         if(isNeg){
             temp = Math.abs(n);
         }
        while (temp>0){
            int rem = temp%10;
            sum = sum*10+rem;
            temp = temp/10;
        }
        return isNeg?-sum:sum;
    }
}
