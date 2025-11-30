package EPAM.coding.LL;

import java.util.LinkedList;
class NoSuchElementEx extends RuntimeException{
    NoSuchElementEx(String s){
        super(s);
    }
}
public class Custom<E> {
    private Node head;
    private Node tail;
    private int size = 0;
    class Node{
        E data;
        Node next;
        Node(E data){
            this.data = data;
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
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
        tail = node;
        size++;
        return true;
    }

    public void addFirst(E data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = head;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }
    public void addLast(E data){
        Node node = new Node(data);
        if (head == null){
            addFirst(data);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    public E getFirst(){
        if (head==null){
            throw new NoSuchElementEx("No Such Element Exception");
        }
        return head.data;
    }
    public E getLast(){
        if (head==null){
            throw new NoSuchElementEx("No such Element Exception");
        }
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        return temp.data;
    }
    public String toString(){
        String data = "[ ";
        Node temp = head;
        while (temp.next!=null){
            data = data+temp.data+" ,";
            temp = temp.next;
        }
        data = data+temp.data;
        return data+" ]";
    }
    public E removeFirst(){
        if (head == null){
            throw new NoSuchElementEx("No Element found");
        }
        E data = head.data;
        head = head.next;
        return data;
    }
    public E removeLast(){
        if (head == null){
            throw new NoSuchElementEx("No Such Element found");
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        E data = temp.next.data;
        temp.next = null;
        tail = temp;
        return data;

    }


    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(100);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);


        Custom<Integer> custom = new Custom<>();
        custom.add(10);
        custom.add(20);
        custom.add(30);
        custom.add(40);
        custom.add(50);
        custom.add(60);
        System.out.println(custom);
        System.out.println(custom.getFirst());
        System.out.println(custom.getLast());
        custom.addLast(1000);
        custom.addFirst(300);
        System.out.println(custom);
        System.out.println(custom.removeFirst());
        System.out.println(custom);
        System.out.println(custom.getLast());
    }
}
