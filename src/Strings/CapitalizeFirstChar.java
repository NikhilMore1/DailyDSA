package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalizeFirstChar {
    public static void main(String[] args) {
        String str = "Hello nikhil more";
        System.out.println(getString(str));
    }
    public static String getString(String str){
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String ele : arr){
           sb.append(Character.toUpperCase(ele.charAt(0)));
           sb.append(ele.substring(1)); 
           sb.append(" ");
        }
        return sb.toString().trim();
        }
    }
