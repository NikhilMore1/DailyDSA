package collection_Framework.ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeA(ArrayList<Integer>arr,ArrayList<Integer>ans,int i){
        if (i>=arr.size()){
            return ans;
        }
        if (!ans.contains(arr.get(i))){
            ans.add(arr.get(i));
        }
        return removeA(arr,ans,++i);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer>ans = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(10);
        arr.add(30);
        arr.add(20);
        arr.add(40);
        arr.add(50);
        System.out.println(arr);
        System.out.println(removeA(arr,ans,0));
    }
}
