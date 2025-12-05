package EPAM.coding.Heaps;

import java.util.*;

public class PriorityQ<E> {
    private int CAPACITY = 11;
    private int size = 0;
    private E[] arr;
    PriorityQ(){
        arr =(E[]) new Object[CAPACITY];
    }
    PriorityQ(int cap){
        arr =(E[]) new Object[cap];
    }
//    public boolean add(E data){
//        if (size == 0){
//            arr[size] = data;
//            size++;
//            return true;
//        }
//        arr[size] = data;
//    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        ArrayList<Integer> arr = new ArrayList<>();

    }
}
