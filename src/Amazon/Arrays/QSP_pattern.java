package Amazon.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QSP_pattern {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        int[] arr = new int[]{1,2,3,4,1,2};
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                if (i!=j){
                    if (arr[i] == arr[j]){
                        arrayList.add(arr[j]);
                    }
                }else {
                    arrayList1.add(arr[j]);
                }
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList1);
        System.out.println(arrayList1);
    }
}
