package ArraysProblems.Assesments;

public class MostOneCount {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1};
        int max = 0;
        int count = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == 1) {
                count = count + 1;
            }
            else {
                count=0;
            }
            if (count>max)
                max = count;
        }
        System.out.println(max);

    }
}
