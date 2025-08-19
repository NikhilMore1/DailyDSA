package ArraysProblems;

import java.util.ArrayList;

public class MajorityEle {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2};
        System.out.println(getele(arr));
    }
    public static int getele(int[] arr){
        ArrayList<Integer>arrayList = new ArrayList<>();
        int time = arr.length/2;
        for (int i = 0;i<arr.length;i++){
            int count = 0;
            for (int j = 0;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count>=time && !arrayList.contains(arr[i])){
                arrayList.add(arr[i]);
            }
        }
        return 1;
        
    }
}
