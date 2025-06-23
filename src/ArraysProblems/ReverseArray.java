package ArraysProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the ele");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[arr.length];
        int sum = arr1.length-1;
        for (int i=0;i<arr.length;i++){
            arr1[sum] = arr[i];
            sum = sum-1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}