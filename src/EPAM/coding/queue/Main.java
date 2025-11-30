package EPAM.coding.queue;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
class IndexOutOfBoundEx extends RuntimeException{
    IndexOutOfBoundEx(String s){
        super(s);

    }
}
public class Main<E>{
    private  int size = 0;
    private E[] arr;
    private int cap = 10;
    Main(){
        arr =(E[]) new Object[10];
    }
    Main(int cap){
        arr =(E[]) new Object[this.cap];
    }
    public void add(int ind,E data){
        if (ind>=size || ind<0){
            throw new IndexOutOfBoundEx("Index Out of Bounds");
        }
        for (int i = size - 1; i >= ind; i--) {
            arr[i + 1] = arr[i];
        }
        arr[ind] = data;
        size++;
    }
    public boolean add(E data){
        if (size<cap){
            arr[size] = data;
            size++;
            return true;
        }
        resize();
        return true;
    }
    public int size(){
        return size;
    }
    public void resize(){
        E[] temp =(E[]) new Object[cap*2];
        cap = cap*2;
        for (int i = 0;i<size;i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }
    public int getCapacity(){
        return cap;
    }
    public String toString(){
        String data = "[ ";
        for (int i = 0;i<size-1;i++){
            data = data+arr[i]+" ,";
        }
        data = data+arr[size-1];
        return data+" ]";
    }
    public static void main(String[] args)throws Exception {
        Main<Integer> main1 = new Main<>();
        main1.add(10);
        main1.add(20);
        main1.add(30);
        main1.add(10);
        main1.add(20);
        main1.add(30);
        main1.add(0,1110);
        main1.add(20);
        main1.add(30);
        main1.add(300);
        main1.add(10);
        main1.add(20);
        main1.add(30);
        System.out.println(main1.getCapacity());
        System.out.println(main1);
    }
}
