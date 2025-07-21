package Recurssion;

public class Recurssion2 {
    public static void main(String[] args) {
        System.out.println(getFib(5));
    }
    public static int getFib(int n){
        if(n == 1)
            return 1;
//        int sum = 0;
         return  n * getFib(n-1);
//         return sum;
    }
}
