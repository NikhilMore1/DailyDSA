package ArraysProblems.AssignmentQue;

public class MostRepeating {
    public static int getMax(int[] arr){
        int max = 0;
        int max1 = max;
        int mostFreq = arr[0];
        int most = mostFreq;
        for (int i=0;i<arr.length;i++){
            int count = 0;
            for (int j=0;j<arr.length;j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count>max){
                max1 = max;
                max = count;
                most = mostFreq;
                mostFreq = arr[i];

            }
        }
        return most;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,33,3,3,3,3,3,3,4,5,6,6,6,6,6,6,6,6,7,8,8};
        System.out.println(getMax(arr));
    }
}
