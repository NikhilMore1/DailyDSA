package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static int[] reverse(int[] arr,int i , int j){
        if(i == j){
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return reverse(arr,++i,--j);
    }

    public static int fib(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }


    public static void subsequences(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        generate(0, arr, new ArrayList<>(), ans);
        System.out.println(ans);
    }


    private static void generate(int index, int[] arr, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> ans) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(current)); // add copy of current list
            return;
        }

        // Include arr[index]
        current.add(arr[index]);
        generate(index + 1, arr, current, ans);

        // Exclude arr[index]
        current.remove(current.size() - 1);
        generate(index + 1, arr, current, ans);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
//        System.out.println(Arrays.toString(reverse(arr,0,arr.length-1)));
//        System.out.println(fib(4));
        subsequences(arr);
    }
}
