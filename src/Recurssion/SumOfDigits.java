package Recurssion;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 123;
        int rem = 0;
        int sum = 0;
        getSum(num,0);
    }
    public static void getSum(int num,int sum){
       if(num<=0){
           return ;
       }
       int rem = num%10;
        sum = sum*10+rem;
        getSum(num/10,sum);
        System.out.println(sum);
    }

}
