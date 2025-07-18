package Amazon.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class FindMaxSub {
    public static ArrayList<Integer> getMax(int[] arr,int k){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0;i<=k;i++){
            int max = arr[i];
            for(int j =i;j<i+k;j++){
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            ans.add(max);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter the array ele");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int k = 3;
        ans = getMax(arr,k);
        for (int ele:ans){
            System.out.println(ele);
        }
    }
}
