package Numbers;

public class DuckNum {
    public static boolean duck(int num){
        int flag = 0;
        while (num>0){
            int rem = num%10;
            if(rem == 0){
                flag= 1;
            }
            num = num/10;
        }
        if(flag==1)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int num = 123;
        System.out.println(duck(num));
    }
}
