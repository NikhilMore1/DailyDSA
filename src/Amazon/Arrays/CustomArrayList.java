package Amazon.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
        CustomArrayList<String> arr = new CustomArrayList<>();
        arr.add("Ni");
        arr.add("Kh");
        arr.add("il");
        arr.add("more");
        System.out.println(arr.toString());
        System.out.println(arr.size());
        arr.set(1,"yash");
        System.out.println(arr.toString());
        System.out.println(arr.isEmpty());
    }
    int defaultSize =10;
    static int size = 0;
    Object[] data ;
    CustomArrayList(){
        this.data = new Object[defaultSize];
    }
    public void add(T ele){
        if(data.length <= size){
            resize(data);
        }
        data[size++] = ele;
    }
    public int resize(Object[] data){
        return defaultSize = data.length*2;
    }
    public String toString(){
        return "data is ["+ Arrays.toString(data) ;
    }
    public int size(){
        return size;
    }
    public void set(int id,T ele){
        data[id] = ele;
    }
    public boolean isEmpty(){
       boolean flag = false;
       for (int i = 0;i<size;i++){
           if(data[i].equals(0))
               flag = true;
       }
       return flag;
    }
}
