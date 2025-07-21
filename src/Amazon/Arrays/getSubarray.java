package Amazon.Arrays;
import java.util.Scanner;
public class getSubarray {
    public static int[] getArr(int[] arr,int target){
        int[] ar = new int[2];
        for (int i =0;i<arr.length;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum = sum+arr[j];
                if(sum == target){
                    ar[0] = i;
                    ar[1] = j;
                }
            }
        }
        return ar;
    }
    public static void main(String[] args){
        int[] arr = new int[6];
        System.out.println("Enter the ele");
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target ele");
        int target = sc.nextInt();
        int[] ans = getArr(arr,target);
        for (int ele : ans){
            System.out.println(ele);
        }
    }
}
