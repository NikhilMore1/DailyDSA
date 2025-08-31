package collection_Framework.Cursors;

import Recurssion.StringRecurssion;

interface Enumaration<E>{
    public boolean hasMoreElements();
    public E nextElement();
}
class MyException extends RuntimeException{
    MyException(String s){
        super(s);
    }
}
public class CustomEnumaration<E> implements Enumaration<E>{
private E[] arr ;
private int pointer = 0;
public int size = 0;
private final int Default = 10;
CustomEnumaration(){
    this.arr =(E[]) new Object[Default];
}
CustomEnumaration(int s){
    this.arr = (E[]) new Object[s];
 }
public void add(E data){
    if (isFull()){
        resize();
    }
    arr[size++] = data;
}
public boolean isFull(){
    if (size >= arr.length){
        return true;
    }
    return false;
}
public void resize(){
    E[] temp = (E[]) new Object[(int)(arr.length*1.5)];
    for (int i = 0;i<arr.length;i++){
        temp[i] = arr[i];
    }
    arr = temp;
}

    @Override
    public boolean hasMoreElements() {
        if (pointer<size){
            return true;
        }
        return false;
    }

    @Override
    public E nextElement() {
        if (!hasMoreElements()){
            throw  new MyException("NoSuchElementFoundException");
        }
        return arr[pointer++];
    }
    @Override
    public String toString(){
    if(size == 0){
        return "[]";
    }
    String data = "[ ";
    String data1 = "";
    for (int i = 0;i<size-1;i++){
        data = data+arr[i]+" ,";
    }
        data = data+arr[size-1];
    return data+" ]";
    }
    public static void main(String[] args) {
        CustomEnumaration<Integer> arr = new CustomEnumaration<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        CustomEnumaration<Integer> arr1 = new CustomEnumaration<>();
        arr1.add(100);
        arr1.add(200);
        arr1.add(300);
        CustomEnumaration enumaration = arr;
        while (enumaration.hasMoreElements()){
            System.out.println(enumaration.nextElement());
        }
        CustomEnumaration enumaration1 = arr1;
        while (enumaration1.hasMoreElements()){
            System.out.println(enumaration1.nextElement());
        }
    }
}
