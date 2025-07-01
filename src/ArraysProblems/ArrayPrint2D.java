package ArraysProblems;

public class ArrayPrint2D {
    public static void printFor(int[][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static  void printWhile(int[][] arr){
        int i = 0;
        while (i<arr.length){
            int j = 0;
            while (j<arr[i].length){
                System.out.println(arr[i][j]);
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void printDo_While(int [][] arr){
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.println(arr[i][j]);
                j++;
            }while (j<arr[i].length);
            i++;
            System.out.println();
        }while (i<arr.length);
    }
    public static void  printForEach(int[][] arr){
        for (int [] arr1 :arr){
            for (int i : arr1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5}};
        printForEach(arr);
    }
}
