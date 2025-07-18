package Searching;

public class RichPerson {
    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3},{3,5}};
        System.out.println(getMax(arr));
    }
    public static int getMax(int[][] arr){
        int sum = 0;
        for (int i =0;i<arr.length;i++){
            int temp = 0;
            for (int j = 0;j<arr[i].length;j++){
                temp = temp+arr[i][j];
                if (sum<temp)
                    sum = temp;
            }
        }
        return sum;
    }
}
