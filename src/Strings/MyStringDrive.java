package Strings;

import java.util.Arrays;

class MyStringIndexOutOfBoundException extends RuntimeException {
    public MyStringIndexOutOfBoundException(String msg)
    {
        super(msg);
    }
}

final class MyString
{
    char [] arr;

    public MyString() {
        arr = new char[0];
    }

    public MyString(String str) {
        arr = new char[str.length()];
        for(int i =0;i<str.length();i++)
            arr[i]=str.charAt(i);
    }

    public MyString(StringBuffer sb){
        this(sb.toString());
    }

    public MyString(StringBuilder sb){
        this(sb.toString());
    }

    public MyString(char [] arr) {
        this.arr = new char[arr.length];
        for (int i=0;i<arr.length;i++)
            this.arr[i] = arr[i];
    }

    public MyString(char[] arr,int start,int count) {
        if((start+count)>arr.length)
            throw new MyStringIndexOutOfBoundException(" String index out of range:"+(start+count));
        this.arr = new char[count];
        for(int i=start,j=0;i<(start+count);i++,j++) {
            this.arr[j]=arr[i];
        }
    }

    public int length() {
        return arr.length;
    }

    public boolean isEmpty() {
        return arr.length ==0;
    }

    public char charAt(int idx) {
        if(idx<0||idx>arr.length-1){
            throw new MyStringIndexOutOfBoundException ("String index out of range:"+idx);

        }
        return arr[idx];
    }

    public int codePointAt(int idx) {
        if(idx<0||idx>arr.length-1){
            throw new MyStringIndexOutOfBoundException ("String index out of range:"+idx);

        }
        return arr[idx];
    }

    public int codePointBefore(int idx) {
        return codePointAt(idx-1);
    }

    public int codePointCount(int start,int end) {
        if(start>end||start<0||end>=arr.length||end<0||start>=arr.length) {
            throw new IndexOutOfBoundsException();
        }
        return end -start;
    }

    public MyString toUpperCase() {
        char [] newArr = new char[arr.length];
        for(int i=0;i<newArr.length;i++) {
            char ch = arr[i];
            newArr[i] = (ch>=97 && ch<=122)?(char)(ch-32):ch;
        }
        return new MyString(newArr);
    }

    public MyString toLowerCase() {
        char [] newArr = new char[arr.length];
        for (int i=0;i<newArr.length;i++) {
            char ch = arr[i];
            newArr[i] = ch>=65 && ch<=90 ? (char)(ch+32):ch;
        }
        return new MyString(newArr);
    }

    public int indexOf(char ch) {
        for (int i=0;i<arr.length ;i++ ) {
            if(arr[i]==ch)
                return i;
        }
        return -1;
    }

    public int indexOf(char ch,int idx) {
        for(int i=idx;i<arr.length;i++) {
            if(arr[i]==ch)
                return i;
        }
        return -1;
    }

    public int lastIndexOf(char ch) {
        for (int i=arr.length-1;i>=0 ;i--) {
            if(arr[i]==ch)
                return i;
        }
        return -1;
    }


    @Override
    public String toString(){
        String str = "";
        for(char ele:arr)
            str+=ele;
        return str;
    }

    public MyString concat(MyString merge){
        char[] newArr = new char[arr.length+merge.length()];
        int index = 0;
        for(char ele:arr){
            newArr[index++] = ele;
        }
        for(int i = 0;i<merge.length();i++){
            newArr[index++] = merge.charAt(i);
        }
        return new MyString(newArr);
    }

    public boolean startsWith(MyString prefix, int start){
        if(arr.length<prefix.length() || start > arr.length)
            return false;
        for (int i = 0;i<prefix.length();i++){
            if (arr[i]!=prefix.charAt(i))
                return false;
        }
        return true;
    }
    public boolean startsWith(MyString prefix){
        return startsWith(prefix,0);
    }

    public boolean endsWith(MyString suffix){
        if (arr.length<suffix.length())
            return false;
        for (int i = suffix.length()-1,j = arr.length-1;i>=0;i--,j--){
            if (arr[j]!=suffix.charAt(i))
                return false;
        }
        return true;
    }
    @Override
    public boolean equals(Object ob){
        if (!(ob instanceof MyString)) return false;
        MyString str = (MyString) ob;
        if (arr.length != str.length()) return false;

        for (int i = 0;i<str.length();i++){
            if (arr[i] != str.charAt(i))
                return false;
        }
        return true;
    }
    public boolean contains(MyString obj){
        for(int i = 0;i<arr.length-obj.length();i++){
            if (startsWith(obj,i)) return true;
        }
        return false;
    }
    public MyString replace(char s1,char s2){
        char[] newArr = arr.clone();
        for (int i =0; i<arr.length;i++){
            if (arr[i] == s1){
                arr[i] = s2;
            }
        }
        return new MyString(arr);
    }
    public char[] toCharArray(){
        char[] arr1 = new char[arr.length];
        for(int i =0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        return Arrays.toString(arr1).toCharArray(); 
    }
    public MyString trim(){
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=' '){
                sb.append(arr[i]);
            }
        }
        String str = new String(sb);
        return new MyString(str);
    }

}

public class MyStringDrive {
    public static void main(String[] args) {
     MyString str = new MyString(" Hello ");
        System.out.println(str.trim());
        // String str = new String();
        // System.out.println(str);

        // String str = new String(arr);
        // System.out.println(str);

        // StringBuffer sb = new StringBuffer("buffer");
        // String str = new String(sb);
        // System.out.println(str);

        // StringBuilder sb = new StringBuilder("Builder");
        // String str = new String(sb);
        // System.out.println(str);

        // String str = new String(arr);
        // System.out.println(str);

        // MyString str1 = new MyString(arr);
        // System.out.println(str1);

        // String str = new String(arr,1,23);
        // System.out.println(str);

        // MyString str1 = new MyString(arr,1,23);
        // System.out.println((str1));






        // String a = "ABCDEFGH";
        // String str = new String(a);
        // System.out.println(str.length());

        // MyString str1 = new MyString(a);
        // System.out.println(str1.length());

        // String b = " ";
        // String str = new String(b);
        // System.out.println(str.isEmpty());

        // MyString str1 = new MyString(b);
        // System.out.println(str1.isEmpty());

        // String b = "shreyash";
        // String str = new String(b);
        // System.out.println(str.charAt(1));

        // MyString str1 = new MyString(b);
        // System.out.println(str1.charAt(8));

        // String b = "shreyash";
        // String str = new String(b);
        // System.out.println(str.codePointAt(1));

        // MyString str1 = new MyString(b);
        // System.out.println(str1.codePointAt(9));

        // String b = "shreyash";
        // String str = new String(b);
        // System.out.println(str.codePointBefore(1));

        // MyString str1 = new MyString(b);
        // System.out.println(str1.codePointBefore(1));

        // String b = "shreyash";
        // String str = new String(b);
        // System.out.println(str.codePointCount(1,5));

        // MyString str1 = new MyString(b);
        // System.out.println(str1.codePointCount(1,5));

        // String b = "shreyash";
        // String str = new String(b);
        // System.out.println(str.toUpperCase());

        // MyString str1 = new MyString(b);
        // System.out.println(str1.toUpperCase());

        // String b = "ABCD8376$^&^&YASH";
        // String str = new String(b);
        // System.out.println(str.toLowerCase());

        // MyString str1 = new MyString(b);
        // System.out.println(str1.toLowerCase());

        // String b = "abcdefghijklmnopqrstuvwxz";
        // String str = new String(b);
        // System.out.println(str.indexOf('y'));

        // MyString str1 = new MyString(b);
        // System.out.println(str1.indexOf('z'));


        // String b = "abcdefabghicjklmnmnopqrsqrtuvwxz";
        // String str = new String(b);
        // System.out.println(str.indexOf('m',5));

        // MyString str1 = new MyString(b);
        // System.out.println(str1.indexOf('m',5));




    }
}