package Amazon.Arrays;
import java.util.*;
public class PascalsTriangle {
    public static void get(int row){
        for (int i = 0;i<row;i++){
            for (int j = 0;j<row-i;j++){
                System.out.print(" ");
            }
            int n = 1;
            for (int j = 1;j<=i;j++){
                System.out.print(n+" ");
                n = n*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        get(5);
    }
}
