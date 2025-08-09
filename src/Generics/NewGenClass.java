package Generics;

import java.util.Arrays;
import java.util.LinkedList;

public class NewGenClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        maxSum(arr);
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        return list1;
    }

    public static void getCount(String str, String target) {
        String[] arr = str.split("");
        int count = 0;
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                count++;
            } else {
                continue;
            }
        }
        System.out.println(str.length());
        System.out.println(Arrays.toString(arr) + " " + count + " " + ans);
    }

    public static void maxSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                count = count + (arr[i] + arr[j]);
                if (sum < count) {
                    sum = count;
                }
            }
        }
        System.out.println(sum);
    }
}