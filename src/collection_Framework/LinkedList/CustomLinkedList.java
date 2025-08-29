package collection_Framework.LinkedList;
import java.util.Date;
import java.util.LinkedList;
class MyException extends RuntimeException{
    MyException(String str){
        super(str);
    }
}
class CustomLinkedListMain<E>{
    Node head;
    Node tail;
    private int size = 0;
    private class Node {
        E data;
        Node  next;
        Node(E data){
            this.data = data;
        }
    }

    public boolean add(E data){
        boolean flag = false;
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
            tail = newNode;
            flag = true;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            flag = true;
        }
        size++;
        return flag;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
        if (size == 0){
            return "[]";
        }
        String Data = "[ ";
        Node temp = head;
        while (temp.next!=null){
            Data = Data+temp.data +",";
            temp = temp.next;
        }
        Data = Data+temp.data+" ]";
        return Data;
    }
    public void add(int index,E data){
        if (index<0 || index>size) {
            throw new MyException("IndexOutOfBound Exception");
        }
        Node newNode = new Node(data);
        Node temp = getNode(index);
        newNode.next = temp.next.next;
        temp.next = newNode;
    }
    public Node getNode(int index){
        Node temp = head;
        for (int i = 0;i<index-1;i++){
            temp = temp.next;
        }
        return temp;
    }
    public E get(int index){
        if (index<0 || index>size){
            throw new MyException("IndexOutOfBoundException occured");
        }
        Node temp = head;
        for (int i =0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public E set(int index,E data){
        if (index<0 || index>size){
            throw new MyException("IndexOutOfBoundException ");
        }
        Node temp = head;
        for (int i =0;i<index;i++){
            temp = temp.next;
        }
        E oldData = temp.data;
        temp.data = data;
        return oldData;
    }

    public void addFirst(E data){
        Node newNode = new Node(data);
        if (size == 0){
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(E data){
        Node newNode = new Node(data);
        if (size == 0){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public E removeFirst(){
        if (size == 0){
            throw new MyException("NoSuchElementFound");
        }
        E oldData = head.data;
        head = head.next;
        size--;
        return oldData;
    }
    public E removeLast(){
        if (size == 0){
            throw  new MyException("NoSuchElementFoundException");
        }
        Node temp = head;
        for (int i =0;i<size-1;i++){
            temp = temp.next;
        }
        E oldData = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return oldData;
    }
    public E getFirst(){
        if (size == 0){
            throw new MyException("NoSuchElementFoundException");
        }
        return head.data;
    }
    public E getLast(){
        if (size == 0){
            throw new MyException("NoSuchElementFoundException");
        }
        return tail.data;
    }

    public boolean remove(E data){
        boolean flag = false;
        Node temp = head;
        if (temp.data.equals(data)){
         removeFirst();
         return true;
        }
        for (int i = 0;i<size;i++) {
            if(temp.next == tail){
                temp.next = null;
                temp = tail;
                size--;
                return true;
            }
            if (!(temp.next.next == null)) {
                if (temp.next.data.equals(data)) {
                    temp.next = temp.next.next;
                    flag = true;
                    size--;
                    return flag;
                } else {
                    temp = temp.next;
                }
            }
        }
//        size--;
        return flag;
    }

    public E remove(int index){
        if (index<0 || index>size){
            throw new MyException("IndexOutOfBoundException");
        }
        if (index == 0){
           E ele = removeFirst();
           return  ele;
        }
        Node temp = head;
        for (int i = 0;i<index-1;i++){
            temp = temp.next;
        }
        E Data = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return Data;
    }
    public int indexOf(E data){
        Node temp = head;
        for (int i = 0;i<size;i++){
            if (temp.data.equals(data)){
                return i;
            }else {
                temp = temp.next;
            }
        }
        return -1;
    }
   public boolean addAll(CustomLinkedListMain<E> coll){
        if (coll.size == 0){
            return false;
        }
        Node temp = head;
        Node temp1 = coll.head;
        for (int i = 0;i<size;i++){
            if (temp.next == null){
                for (int j = 0;j<coll.size;j++){
                    temp.next = temp1;
                    temp1 = temp1.next;
                    temp = temp.next;
                }
            }else {
                temp = temp.next;
            }
        }
        size = size+coll.size;
         return true;
   }
   public boolean addAll(int index,CustomLinkedListMain<E> coll){
        if (index<0 || index>size){
            throw new MyException("IndexOutOfBoundException");
        }
        if (coll.size == 0){
            return false;
        }
        if (index == 0){
            coll.tail.next = head;
            head = coll.head;
            size = size+coll.size;
            return true;
        }
        if (index == size-1){
            tail.next = coll.head;
            tail = coll.tail;
            size = size+coll.size;
            return true;
        }
        Node temp = head;
        for (int i = 0;i<index-1;i++){
            temp = temp.next;
        }
        Node next = temp.next;
        Node temp1 = coll.head;
        for (int i = 0;i<coll.size;i++){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
        }
        temp.next = next;
        while (temp.next!=null){
            temp = temp.next;
            if (temp.next == null){
                tail = temp;
            }
        }
       System.out.println(tail.data);
        size = size+coll.size;
        return true;

   }
   public boolean contains(E data){
        Node temp = head;
        for (int i = 0;i<size;i++){
            if (temp.data.equals(data)){
                return true;
            }
            temp = temp.next;
        }
        return false;
   }
}
public class CustomLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();
        LinkedList<Integer> data1 = new LinkedList<>();
        data1.add(100);
        data.add(10);
        data.add(10);
        data.add(20);
        data.add(20);
        CustomLinkedListMain<String> list1 = new CustomLinkedListMain<>();
        list1.add("hello");
        list1.add("java");
        list1.add("langauge");
        CustomLinkedListMain<String> list2 = new CustomLinkedListMain<>();
        list2.add("str");
        list2.add("eg");
        list2.add("linked");
        list2.add("list");
        System.out.println(list1.addAll(list2));
        System.out.println(list1);
    }
}
