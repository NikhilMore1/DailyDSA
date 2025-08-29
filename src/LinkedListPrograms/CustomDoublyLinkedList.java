package LinkedListPrograms;

import javax.naming.InsufficientResourcesException;
import java.util.LinkedList;

class MyException extends RuntimeException {
    MyException(String s){
        super(s);
    }
}
class MyIndexOutOfBoundsException extends RuntimeException{
    MyIndexOutOfBoundsException(String s){
        super(s);
    }
}
public class CustomDoublyLinkedList<E> {
       private class Node{
           E data;
           Node prev;
           Node next;
           Node(E data){
               this.data=data;
           }
       }
       private Node head;
       private Node tail;
       private int size = 0;
       public void add(E data){
           Node node = new Node(data);
           if (head == null){
               head = node;
               tail = node;
               size++;
               return;
           }
           tail.next = node;
           node.prev = tail;
           tail = node;
           size++;
       }
       public int size(){
           return size;
       }
       @Override
       public String toString(){
           if (size ==0 ){
               return "[]";
           }
           String data = "[ ";
           Node temp = head;
           while (temp.next != null){
               data = data+temp.data+" ,";
               temp = temp.next;
           }
           data = data+temp.data;
           return data+" ]";
       }
       public boolean isEmpty(){
           return size == 0;
       }
       public void clear(){
           head = null;
           tail = null;
           size = 0;
       }
       public int indexOf(E data){
           Node temp = head;
           for (int i = 0;i<size;i++){
               if (data.equals(temp.data)){
                   return i;
               }
               temp = temp.next;
           }
           return -1;
       }
       public int lastIndexOf(E data){
           Node temp = tail;
           for (int i = size-1;i>=0;i--){
               if (data.equals(temp.data)){
                   return i;
               }
               temp = temp.prev;
           }
           return -1;
       }

       public void addFirst(E data){
           Node node = new Node(data);
           if (head == null){
               head = node;
               tail = node;
               size++;
               return;
           }
           head.prev = node;
           node.next = head;
           head = node;
           size++;
       }
       public void addLast(E data){
           Node node = new Node(data);
           if (head == null){
               head = node;
               tail = node;
               size++;
           }
           tail.next = node;
           node.prev = tail;
           tail = node;
           size++;
       }
       public E removeFirst(){
           if (head == null){
               throw new MyException("No Such Element found");
           }
           E data = head.data;
           Node temp = head.next;
           head.next.prev = null;
           head.next = null;
           head = temp;
           size--;
           return data;
       }
       public E removeLast(){
           if (head==null){
               throw new MyException("No Such Element found");
           }
           Node temp = tail.prev;
           E data = tail.data;
           tail.prev.next = null;
           tail.prev = null;
           tail = temp;
           size--;
           return data;
       }
       public E getFirst(){
           if (head == null){
               throw new MyException("No Such Element found");
           }
           return head.data;
       }
    public E getLast(){
        if (head == null){
            throw new MyException("No Such Element found");
        }
        return tail.data;
    }
    public E remove(){
           if (head == null){
               throw new MyException("No Such Element found");
           }
           E data = removeFirst();
           return data;
    }
    public E remove(int idx){
           E data = null;
           if (idx<0 || idx>=size){
               throw new MyIndexOutOfBoundsException("index out of bound");
           }
           Node temp = head;
           if (idx == 0){
               data = removeFirst();
               return  data;
           }
           if (idx == size-1){
               data = removeLast();
               return data;
           }
           for (int i = 0;i<size;i++){
               if (i == idx-1){
                   Node reff = temp.next;
                   data = reff.data;
                   temp.next = temp.next.next;
                   temp.next.prev = temp;
                   reff.prev=null;
                   reff.next=null;
                   size--;
                   return  data;
               }
               temp = temp.next;
           }
           return data;
    }
    public boolean remove(E data){
           if (head == null){
               throw new MyException("No such element found");
           }
           Node temp = head;
           for (int i = 0;i<size;i++){
               if (temp.next.data.equals(data)){
                   Node reff = temp.next;
                   temp.next = temp.next.next;
                   temp.next.prev = temp;
                   reff.prev = null;
                   reff.next = null;
                   size--;
                   return true;
               }
               temp = temp.next;
           }
           return false;
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(20);
        System.out.println(linkedList);
        Integer a = 200;

        System.out.println(linkedList.remove(a));
        System.out.println(linkedList);
        CustomDoublyLinkedList<Integer> list = new CustomDoublyLinkedList<>();
        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(30));
        list.addFirst(100);
        list.addLast(2000);
        System.out.println(list);
        Integer aa = 30;
        System.out.println(list.remove(aa));
        System.out.println(list);
    }
}
