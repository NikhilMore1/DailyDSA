package EPAM.LastDay;

public class MissingNum {
    public static void main(String[] args) {
        int sum = 0;
        int act = 0;
        int[] arr = {3,0,1,2,5,6,7,4};
        act = arr.length*(arr.length+1)/2;
        for (int ele :arr){
            sum = sum+ele;
        }
        System.out.println(act-sum);
    }
}
