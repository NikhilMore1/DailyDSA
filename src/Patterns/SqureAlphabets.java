package Patterns;

import java.util.Scanner;

public class SqureAlphabets {
    public static void colVise(int row,int cols){
        for(int i=1;i<=row;i++){
            for (int j=1;j<=cols;j++){
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter cols");
        int cols = sc.nextInt();
        colVise(row,cols);
    }
}
