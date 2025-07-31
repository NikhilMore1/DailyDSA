package Strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class CombinationOfNum {
    public static void main(String[] args) {
        String str = "239";
        System.out.println(getStrCom(str));
    }
    public static ArrayList<String> getStrCom(String str){
        String[] digit = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        for (int i = 0;i<str.length();i++){
            int max = Character.getNumericValue(str.charAt(i));
            while (list.get(i).length() == i){
               String myfirst =  list.remove(i);
               for (char newNum : digit[max].toCharArray()){
                        list.add(myfirst+newNum);
               }
            }
        }
        return list;
    }
}
