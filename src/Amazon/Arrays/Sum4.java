package Amazon.Arrays;
import java.util.*;
public class Sum4 {
    public static List<List<Integer>> getSum(int[] arr,int target){
        List<List<Integer>> arrayList = new ArrayList<>();
        Arrays.sort(arr);
        int a,b,c,d = 0;
        for (int i= 0;i<arr.length-3;i++){
            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int j = 0;j<arr.length-3;j++){
                a = j;
                b = j+1;
                c = j+2;
                d = j+3;
                if(arr[a]+arr[b]+arr[c]+arr[d] == target){
                    arr1.add(arr[a]);
                    arr1.add(arr[b]);
                    arr1.add(arr[c]);
                    arr1.add(arr[d]);
                }
            }
            if (!arrayList.contains(arr1)){
                arrayList.add(arr1);
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,2,2,2};
        int target = 8;
        System.out.println(getSum(arr,target));
    }
}
