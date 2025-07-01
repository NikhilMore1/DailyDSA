package ArraysProblems;

import java.util.ArrayList;
import java.util.List;

public class FreqOfEle {
    public static void main(String[] args) {
   int[] arr = {1,2,3,4,5,6,7,7,7,8,88,9,9,9,9};
   boolean[] visit = new boolean[arr.length];
   for (int i=0;i<arr.length;i++){
       if(visit[i])
           continue;
       int count = 1;
       for (int j=i+1;j<arr.length;j++){
           if(arr[i] == arr[j]){
               count ++;
               visit[j] = true;
           }
       }

           System.out.println("the fre of " + (arr[i]) + " is "+ count +" ");


   }
    }
}
