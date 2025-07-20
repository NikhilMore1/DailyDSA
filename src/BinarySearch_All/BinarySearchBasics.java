package BinarySearch_All;
import java.util.*;
public class BinarySearchBasics {
    public static void main(String[] args) {
      int[] arr = new int[3];
      List<Integer>list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<arr.length;i++){
            list.add(arr[i]);
        }
        int k = 4;
        System.out.println(getCount(list,k));
    }
    public static int getCount(List<Integer>num,int k){
        int total = 0;
        int i=0;
        while(k>0){
            int n1 = num.get(i);
            n1 = (int)Math.ceil(n1 / 2);
            num.add(n1);
            i++;
            k--;
            System.out.println(num);
        }
        for(int n:num){
            total = total+n;
        }
        return total;
    }

}
