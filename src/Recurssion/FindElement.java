package Recurssion;

import java.util.ArrayList;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,6,7};
        ArrayList<Integer>ans = new ArrayList<>();
        System.out.println(find1(arr,4,0));
    }
    public static ArrayList<Integer> find(int[] arr, int target, ArrayList<Integer> ans,int index){
        if (index>=arr.length){
            return ans;
        }
        if (arr[index] == target){
            ans.add(index);
        }
        return find(arr,target,ans,++index);
    }
    public static ArrayList<Integer> find1(int[] arr,int target,int i){
         ArrayList<Integer> ans = new ArrayList<>();
        if (i == arr.length){
            return  ans;
        }
        if (arr[i] == target){
            ans.add(i);
        }
        ArrayList<Integer> temp =  find1(arr,target,++i);
        ans.addAll(temp);
        return ans;
    }
}
