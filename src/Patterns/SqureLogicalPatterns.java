package Patterns;

import java.util.Scanner;

public class SqureLogicalPatterns {
    public static void binSquerecols(int row,int cols){
        for (int i=1;i<=row;i++){
            for (int j=1;j<=cols;j++){
                if(j%2==0)
                    System.out.print(0+" ");
                else
                    System.out.print(1+" ");
            }
            System.out.println();
        }
    }

    public static void binSquereRow(int row,int cols){
        for (int i=1;i<=row;i++){
            for (int j=1;j<=cols;j++){
                if(i%2==0)
                    System.out.print(0+" ");
                else
                    System.out.print(1+" ");
            }
            System.out.println();
        }
    }
    public static void evenIndexZero(int row,int cols){
        for (int i = 1; i <= row; i++) {
            for (int j=1;j<=cols;j++){
                if ((i+j)%2==0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }

    public static void noInc(int row,int cols){
        int x=1;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=cols;j++){
                System.out.print(x+" ");
                if(x<9)
                    x++;
                else
                    x=1;
            }
            System.out.println();
        }
    }

    public static void prntColsDec(int row,int col){
        for (int i=1;i<=row;i++){
            for (int j=col;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void printColsDecAlpha(int row,int cols){
        for (int i=1;i<=row;i++){
            for (int j=cols;j>=1;j--){
                System.out.print((char) (87+j)+" ");
            }
            System.out.println();
        }
    }


    public static void seqAlpha(int row,int cols){
        int x = 65;
        for(int i=1;i<=row;i++){
            for (int j=1;j<=cols;j++){
                System.out.print((char)(x++)+" ");
            }
            System.out.println();
        }

    }

    public static void evenIndexAlpha(int row,int cols){
        int x = 65;
        for(int i=1;i<=row;i++){
            for (int j=1;j<=cols;j++){
                if ((i+j)%2==0){
                    System.out.print((char) (x++)+"");
                }else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int row = sc.nextInt();
        System.out.println("Enter the cols");
        int cols = sc.nextInt();
//        binSquerecols(row,cols);
//        binSquereRow(row,cols);
//        evenIndexZero(row,cols);
//        noInc(row,cols);
//        prntColsDec(row,cols);
//        printColsDecAlpha(row,cols);
//        seqAlpha(row,cols);
        evenIndexAlpha(row,cols);
    }
}
