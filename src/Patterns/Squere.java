package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Squere {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row");
        int row = sc.nextInt();
        System.out.println("Enter the no cols");
        int col =sc.nextInt();
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
