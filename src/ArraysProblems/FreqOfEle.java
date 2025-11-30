package ArraysProblems;

import java.util.*;

public class FreqOfEle {

    public static void get(int[] arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>arrayList = new ArrayList<>();
        for (int a:arr){
            arrayList.add(a);
        }
        int max = 0;
        for (int i = 0;i<arr.length;i++){
            map.put(arrayList.get(i), Collections.frequency(arrayList,arr[i]));

        }

        for (Map.Entry<Integer,Integer>entry:map.entrySet()){
            if (entry.getValue()>max){
                max = entry.getKey();
            }
        }
        System.out.println(max);
        System.out.println(map);
    }
    public static void main(String[] args) {
   int[] arr = {1,2,3,4,5,6,7,7,9,7,8,88,9,9,9,9};
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

   get(arr);
    }
}
