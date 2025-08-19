package collection_Framework;

import java.io.IOException;
import java.util.ArrayList;
class MyException extends IOException {
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
        data[idx] = obj;
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
        }
        data[size++] = obj;
        return true;
    }
    public boolean addAll(CustomMyArrayList coll)throws MyException{
        if (coll.isEmpty()){
            return false;
        }
        boolean flag = false;
        if (isFull()){
            resize();
        }
        for (int i = 0;i<coll.size;i++){
            data[size++] =(E) coll.get(i);
            flag = true;
        }
        return flag;
    }
    @Override
    public String toString(){
        if (size == 0){
            return "[]";
        }
        String myData = "";
        myData = "[ ";
        for (int i = 0;i<size-1;i++){
            myData = myData+ data[i] +",";
        }
        myData = myData+data[size-1];
        myData = myData+" ]";
        return  myData;
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

    public boolean containsAll(CustomMyArrayList<E> coll) throws MyException {
        if (coll.isEmpty()){
            return  true;
        }
        for (int i =0;i<coll.size;i++){
            if (!contains(coll.get(i))){
                return false;
            }
        }
        return  true;
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
        for (int i = idx;i<size-1;i++){
                data[i] = data[i+1];
        }
        data[size-1] = null;
        size--;
        return myData;
    }

    public boolean removeAll(CustomMyArrayList coll) throws MyException{
        if (coll.isEmpty()){
            return false;
        }
        boolean flag = false;
        for (int i = 0;i<coll.size;i++){
            if (contains((E)coll.get(i))){
                remove(i);
                flag = true;
            }
        }
        return  flag;
    }
    public int getSize(){
        return size;
    }
    public void  clear(){
        size = 0;
    }

    public boolean retainAll(CustomMyArrayList coll)throws MyException{
        if (coll.isEmpty()){
            clear();
            return true;
        }
        boolean flag = false;
        for (int i = 0;i<size;i++){
            if (!coll.contains(data[i])){
                remove(i);
                i--;
                flag = true;
            }
        }
        return flag;
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
        ArrayList<Integer> data1 = new ArrayList<>();
        data1.add(10);
//        data1.add(1);
//        data1.add(2);
//        System.out.println(data.removeAll(data1));
//        System.out.println(data);
        System.out.println(data.addAll(data1));

        CustomMyArrayList<Integer> arr = new CustomMyArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
//        System.out.println(arr.remove(4));
//        System.out.println(arr.getSize());
//        System.out.println(arr.remove(4));
//        System.out.println(arr);
//        System.out.println(arr.indexOf(30));
        CustomMyArrayList<Integer> ar = new CustomMyArrayList<>();
        ar.add(10);
        ar.add(20);
//        System.out.println(arr.retainAll(ar));
//        System.out.println(arr);
        System.out.println(arr.addAll(ar));

    }
}
