package Amazon.Arrays;
import java.util.*;
public class Findmiss {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,6,7,8};
        Scanner sc = new Scanner(System.in);
        int n = 9;
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the array");
        for(int i = 0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(get(arr));

    }
    public static int get(ArrayList<Integer> arr){

        int n = 0;
        int first = arr.get(0);
        int last = arr.get(arr.size()-1);
        for(int i = first;i<=last;i++){
            if(!arr.contains(arr.get(i))){
                n = arr.get(i);
            }
        }
        return n;
    }
}
