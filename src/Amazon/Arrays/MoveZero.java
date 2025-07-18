package Amazon.Arrays;
import java.util.Arrays;
public class MoveZero {
    public static void main(String[] args){
        int[] arr = {0,9,8,6,5,0,8,8};
        move(arr);
    }
    public static void move(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j = i;j<arr.length-1;j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
