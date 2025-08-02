package Recurssion;
import java.util.ArrayList;
public class RecurssionLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,5,7};
        int target = 5;
//        System.out.println(check(arr,target,0,arr.length-1));
        System.out.println(check(arr,target,0));
    }
    public static ArrayList<Integer> check(int[] arr,int target,int i){
        ArrayList<Integer>arr1 = new ArrayList<>();
        if (i>=arr.length-1){
            return new ArrayList<>();
        }
        if (arr[i]==target){
            arr1.add(i);
        }
        System.out.println(arr1);
        return check(arr,target,++i);
    }
    public static ArrayList<Integer> check(int[] arr,int target,int start,int end){
        ArrayList<Integer>arr1 = new ArrayList<>();
        if (start>end){
            return new ArrayList<>();
        }
        int mid = (start+end)/2;
        if (arr[mid]<target){
            return check(arr,target,mid+1,end);
        }else if(arr[mid]>target){
           return check(arr,target,start,mid-1);
        }else {
            arr1.add(mid);
        }
        return arr1;
    }

}
