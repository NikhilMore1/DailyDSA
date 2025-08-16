package collection_Framework;
import java.util.ArrayList;
class CustomMyArrayList <E>{
static final  int DEFAULT_SIZE = 10;
E[] arr;
CustomMyArrayList(){
    arr =  (E[]) new Object[DEFAULT_SIZE];
}
CustomMyArrayList(int size){
    arr = (E[]) new Object[size];
}
@Override
    public  String toString(){
    return "[]";
}
public void add(int idx,E obj){
    if(arr.length>DEFAULT_SIZE){

    }
}
}
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        CustomMyArrayList<Integer> arrayList = new CustomMyArrayList<>();
        System.out.println(arrayList);
    }
}
