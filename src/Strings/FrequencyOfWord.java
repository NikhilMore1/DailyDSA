package Strings;

import java.util.HashMap;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "This is java and java is java";
        getFreqChar(str);
    }
    public static void getFreqWord(String str){
        boolean [] visit = new boolean[str.length()];
        HashMap<Integer,String>hashMap = new HashMap<>();
        String[] arr = str.split(" ");
        int max = 0;
        int min = Integer.MAX_VALUE;
        String minWord = "";
        String maxStr = "";
        for (int i = 0;i<arr.length;i++){
            int count = 0;
            for (int j = i;j<arr.length;j++){
                if(visit[j]){
                    continue;
                }else if(arr[i].equals(arr[j]) && !visit[j]){
                    count++;
                    visit[j] = true;
                    if(count<min){
                        min = count;
                        minWord = arr[i];
                    }
                }
            }
//            if(count>0){
//                System.out.println(arr[i]+" "+count);
//            }
            if(count>max){
                max = count;
                maxStr = arr[i];
            }
        }
        System.out.println(minWord);
    }
    public static void getFreqChar(String str){
        char[] arr = str.toCharArray();
        boolean [] visit = new boolean[str.length()];
        int max = 0;
        int min = Integer.MAX_VALUE;
        char minCh = '\u0000';
        char maxCh = '\u0000';
        for(int i =0;i<arr.length;i++){
            int count = 0;
            for(int j = 1;j<arr.length;j++){
                if(visit[j] || arr[j] == ' '){
                    continue;
                }else if(arr[i] == arr[j] && !visit[j]){
//                   if(count == 0){
//                       count++;
//                   }
                    count++;
                    visit[j]  = true;
                    if(count<min){
                        min = count;
                        minCh = arr[i];
                    }
                }
            }
//            if(count>0){
//                System.out.println(arr[i]+" " + count);
//            }
            if(count>max){
                max = count;
                maxCh = arr[i];
            }
        }
        System.out.println(minCh);
    }
}
