import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Dutch National flag algorithm
        //Brute Force Solution
        // time complexity O(n2)
        //space complexity O(1)
        Scanner sc  =new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if (arr[i]>2){
                System.out.println("Plese enter value in range ");
            }
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> arr1 = new ArrayList<>();
        int cnt0 = 0,cnt1 = 0,cnt2 = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == 0){
                cnt0++;
            } else if (arr[i] == 1) {
                cnt1++;
            }else {
                cnt2++;
            }
        }
      for (int i = 0;i<cnt0;i++){
          arr1.add(0);
      }
      for (int i = 0;i<cnt1;i++){
          arr1.add(1);
      }
        for (int i = 0;i<cnt2;i++){
            arr1.add(2);
        }
        System.out.println(arr1);
    }
}