package EPAM.coding.ArrayList;

import java.util.ArrayList;

public class RemoveDup {
    public static int remove(int[] arr){
        if (arr.length==0){
            return 0;
        }
        int i = 0;
        for (int j = 1;j< arr.length;j++){
            if (arr[j]  != arr[i]) {
                i++;

                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static int remove1(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0;i<arr.length;i++){
            if (!arrayList.contains(arr[i])){
                arrayList.add(arr[i]);
            }
        }
        return arrayList.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6,7,7,7};
        System.out.println(remove1(arr));
    }
}
