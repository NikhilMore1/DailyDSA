package StringBuffers;

import java.util.Arrays;

public class StringBufferEx {
//    Write a java prog to replace all vowels with there position in str
public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello".toUpperCase());
    char[] arr = sb.toString().toCharArray();
    for (int i = 0;i<arr.length;i++){
        if (arr[i] == 'A'||arr[i] == 'E'||arr[i] == 'I'||arr[i]=='O'||arr[i]=='U') {
            sb.replace(i, i+1, "" + i);
        }
    }
    System.out.println(sb);
}
}
