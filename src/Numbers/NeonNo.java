package Numbers;

public class NeonNo {
    public static boolean Neon(int num){
     int pow = (int)(Math.pow(num,2));
     int sum = 0;
     while (pow>0) {
         int rem = pow % 10;
         sum = sum + rem;
         pow = pow / 10;
     }
     if(sum == num)
         return true;
     return  false;
    }
public static void main(String[] args) {
//    System.out.println(Math.pow(9,2));
    int num = 10;
    System.out.println(Neon(num)?"Neon Number":"Not a Neon Number");

}
}
