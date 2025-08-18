package collection_Framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
class MyException extends IOException{
    public MyException(String str){
        super(str);
    }
}
class CustomMyArrayList<E> {
    private static final int DEAFULT_SIZE = 10;
    private int size = 0;
    E[] data;
    CustomMyArrayList(){
        this.data = (E[]) new Object[DEAFULT_SIZE];
    }
    CustomMyArrayList(int cap){
        this.data = (E[]) new Object[cap];
    }
    public void add(int idx,E obj){
        if(isFull()){
            resize();
        }
        for (int i =0;i< data.length;i++){
            if(i==idx){
                data[i] = obj;
            }
        }
    }
    public boolean isFull(){
        if(size>=data.length){
            return  true;
        }
        return false;
    }
    public void resize(){
        E[] temp = (E[]) new Object[(data.length*3)/2];
        for(int i= 0;i< data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public boolean add(E obj){
        if(isFull()){
            resize();
            return   false;
        }
        data[size++] = obj;
        return true;
    }
    @Override
    public String toString(){
        return  Arrays.toString(data);
    }

    public boolean isEmpty(){
        if (size == 0){
            return  true;
        }
        return  false;
    }

    public boolean contains(E obj){
        for (int i =0;i< data.length;i++){
            if (data[i] == obj){
                return  true;
            }
        }
        return  false;
    }

    public int indexOf(E obj){
        for (int i =0;i<size;i++){
            if (data[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(E obj){
        for (int i = size-1;i>=0;i--){
            if (data[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    public E get(int idx) throws MyException{
       if (idx>=size){
           throw new MyException("IndexOutOfBoundException by get method");
       }
       for (int i = 0;i<size;i++){
           if (i == idx){
               return  data[i];
           }
       }
       return  null;
    }


    public E set(int idx,E obj) throws MyException{
        if (idx>=size){
            throw new MyException("IndexOutOfBound inside the set method");
        }
       E oldValue = data[idx];
        data[idx] = obj;
        return oldValue;
    }

    public E remove(int idx)throws  MyException{
        if (idx>=size){
            throw new MyException("IndexOuttOfBound Exception in remove ");
        }
        E myData = data[idx];
        for (int i = 0;i<size;i++){
            if (i == idx){
                data[i] = data[i+1];
            }
        }
        size--;
        return myData;
    }
    public int getSize(){
        return size;
    }
    public void  clear(){
        size = 0;
    }

}
public class MyArrayList {
    public static void main(String[] args) throws MyException {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(50);
        System.out.println(data.set(3,3100));
        System.out.println(data.get(1));
        CustomMyArrayList<Integer> arr = new CustomMyArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
//        System.out.println(arr.remove(4));
        System.out.println(arr.getSize());
//        System.out.println(arr.remove(4));

        System.out.println(arr.indexOf(30));
        CustomMyArrayList<String>arr1 = new CustomMyArrayList<>();
        arr1.add("hey");
        arr1.add("ut");
        arr1.add("hg");
        arr1.add("nb");
        arr1.add("hey");
        System.out.println(arr1.indexOf("hey"));


        for (int i = 0;i<arr.getSize();i++){
            System.out.println(arr.get(i));
        }
        System.out.println(arr.getSize());
    }
}
