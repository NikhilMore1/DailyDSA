package Recurssions.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static int search(int[] arr , int target , int i){
        if (i>=arr.length-1){
            return -1;
        }
        if (arr[i] == target){
            return i;
        }
        return search(arr,target,++i);
    }
    ArrayList<Integer> arrayList =  new ArrayList<>();
    public  ArrayList<Integer> get(int[] arr , int target , int i){
        if (i>=arr.length){
            return arrayList;
        }
        if (arr[i] == target){
            arrayList.add(i);
        }
        return get(arr,target,++i);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,77,8,9,11,22,77};
        LinearSearch obj = new LinearSearch();
        System.out.println(obj.get(arr,77,0));
    }
}
