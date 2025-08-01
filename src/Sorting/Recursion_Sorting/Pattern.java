package Sorting.Recursion_Sorting;

public class Pattern {
    public static void main(String[] args) {
        triangle2(0,0);
    }
    public static void triangle(int row, int col){
        if(row == 0){
            return;
        }
        if (col<row){
            System.out.print("*");
            triangle(row,col+1);
        }else {
            System.out.println();
            triangle(row-1,0);
        }
    }
    public static void triangle2(int row,int col){
        if (row == 5)
            return;
        if (col<=row){
            System.out.print("*");
            triangle2(row,col+1);
        }
        else {
            System.out.println();
            triangle2(row+1,0);
        }
    }
}
