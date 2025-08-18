package ArraysProblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_3 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(sum(arr));
    }
    public static  List<List<Integer>> sum(int[] arr){
       List<List<Integer>>result = new ArrayList<>();
        Arrays.sort(arr);
       for (int i = 0;i<arr.length;i++){
           for (int j = i+1;j<arr.length;j++){
               for (int k = j+1;k<arr.length;k++){
                   if (arr[i]+arr[j]+arr[k] == 0){
                       List<Integer> ans = new ArrayList<>();
                       ans.add(arr[i]);
                       ans.add(arr[j]);
                       ans.add(arr[k]);
                       if (!result.contains(ans)){
                           result.add(ans);
                       }
                   }
               }
           }
       }
       return  result;
    }
}
