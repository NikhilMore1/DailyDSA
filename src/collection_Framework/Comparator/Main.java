package collection_Framework.Comparator;

import java.util.LinkedList;

class CustomException extends RuntimeException{
    CustomException(String s){
        super(s);
    }
}
public class Main<E> {
    class Node{
        E data;
        Node next;
        Node prev;
        Node(E data){
            this.data = data;
        }
    }
    Node head;
    Node tail;
    private int size = 0;
    public int size(){
        return size;
    }
    public boolean add(E data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = head;
            size++;
            return true;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
        return true;
    }
    public String toString(){
        if (size == 0){
            return "[]";
        }
        String Data = "[ ";
        Node temp = head;
        while (temp.next != null){
            Data = Data+temp.data+" ,";
            temp = temp.next;
        }
        Data = Data+temp.data;
        return Data+" ]";
    }

    public E getFirst(){
        if (size == 0){
            throw new CustomException("NoSuchElementException");
        }
        return head.data;
    }
    public E getLast(){
        if (size == 0){
            throw new CustomException("NoSucHElementException");
        }
        return tail.data;
    }
    public void addFirst(E data){
        Node node = new Node(data);
        if (size == 0){
            add(data);
            return;
        }
        head.prev = node;
        node.next = head;
        head = node;
        size++;
    }
    public void addLast(E data){
        Node node = new Node(data);
        if (size == 0){
            add(data);
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    public E removeFirst(){
        if (size == 0){
            throw new CustomException("NoSuchElementException");
        }
        E data = head.data;
         Node temp = head.next;
         head.next = null;
         head = temp;
         temp.prev = null;
        size--;
        return data;
    }
    public E removeLast(){
        if (size == 0){
            throw new CustomException("NoSuchElementException");
        }
        E data = tail.data;
        Node temp = tail.prev;
        tail.prev = null;
        tail = temp;
        temp.next = null;
        size--;
        return data;
    }
    public void add(int ind,E data){
        Node node = new Node(data);
        if (ind<0 || ind>size-1){
            throw new CustomException("IndexOutOfBoundsException");
        }
        Node temp = head;
        for (int i = 0;i<ind;i++){
            temp = temp.next;
        }
        temp.prev.next = node;
        node.prev = temp.prev;
        node.next = temp;
        temp.prev = node;
        size++;
    }

    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
        Main<Integer> list = new Main<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.addLast(100);
        System.out.println(list.removeLast());
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);
        System.out.println(list.size);
    }
}
