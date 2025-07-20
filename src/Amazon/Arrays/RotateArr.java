package Amazon.Arrays;
import java.util.*;
public class RotateArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        System.out.println("Enter the arr ele");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k rotation");
        int k = sc.nextInt();
        int[] ans = get(arr,k);
        for(int ele : ans){
            System.out.print(ele);
        }
    }
    public static int[] get(int[] arr,int k){
        k = k%arr.length;
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = arr.length-k;i<arr.length;i++){
            array.add(arr[i]);
        }
        for(int i = 0;i<arr.length-k;i++){
            array.add(arr[i]);
        }
        int[] rotated = new int[array.size()];
        for(int i = 0;i<rotated.length;i++){
            rotated[i] = array.get(i);
        }
        return rotated;
    }
}
