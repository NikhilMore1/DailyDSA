import java.util.Scanner;

public class Missing_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the input value");
//        int n = sc.nextInt();
        int[] arr = new int[] {3,1,0,4,6,7,8,9,2};
        int len = arr.length;
        int act = len*(len+1)/2;
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        int diff = act-sum;
        System.out.println(diff);
    }
}
