package EPAM.coding.LL;

import EPAM.coding.queue.Main;

class NoSuchElementEx extends RuntimeException {
    NoSuchElementEx(String s) {
        super(s);
    }
}

public class Custom<E extends Comparable<E>> {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public boolean add(E data) {
        Node<E> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
        return true;
    }

    public void addFirst(E data) {
        Node<E> node = new Node<>(data);

        node.next = head;
        head = node;

        if (tail == null) tail = node;
        size++;
    }

    public E getFirst() {
        if (head == null)
            throw new NoSuchElementEx("No Such Element");
        return head.data;
    }

    public E getLast() {
        if (tail == null)
            throw new NoSuchElementEx("No Such Element");
        return tail.data;
    }

    public E removeFirst() {
        if (head == null)
            throw new NoSuchElementEx("No Element");

        E data = head.data;
        head = head.next;

        if (head == null) tail = null;
        size--;
        return data;
    }

    public E removeLast() {
        if (head == null)
            throw new NoSuchElementEx("No Element");

        if (head.next == null) {
            return removeFirst();
        }

        Node<E> temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        E data = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        Node<E> temp = head;

        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) sb.append(", ");
            temp = temp.next;
        }
        sb.append(" ]");
        return sb.toString();
    }

    // ⭐ Correct Merge (for sorted lists)
    public Custom<E> merge(Custom<E> c1, Custom<E> c2) {

        Custom<E> merged = new Custom<>();

        Node<E> dummy = new Node<>(null);
        Node<E> current = dummy;

        Node<E> t1 = c1.head;
        Node<E> t2 = c2.head;

        while (t1 != null && t2 != null) {
            if (t1.data.compareTo(t2.data) <= 0) {
                current.next = t1;
                t1 = t1.next;
            } else {
                current.next = t2;
                t2 = t2.next;
            }
            current = current.next;
            merged.size++;
        }

        while (t1 != null) {
            current.next = t1;
            t1 = t1.next;
            current = current.next;
            merged.size++;
        }

        while (t2 != null) {
            current.next = t2;
            t2 = t2.next;
            current = current.next;
            merged.size++;
        }

        merged.head = dummy.next;
        Node<E> temp = merged.head;
        while (temp != null && temp.next != null)
            temp = temp.next;
        merged.tail = temp;
        return merged;
    }



    public Custom<E> reverse(){
        Node<E> prev = null;
        Node<E> curr = head;
        Node<E> next1 = null;
        while (curr!=null){
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
        }
        head = prev;
        return this;
    }
    public E middleEle(){
        int mid =(int) Math.ceil(size/2);
        int c = 0;
        Node<E> temp = head;
        while (c<mid){
            temp = temp.next;
            c = c+1;
        }
        System.out.println(temp.data);
        return temp.data;
    }
    public boolean isCycle(){
        Node<E> slow = head;
        Node<E> fast = head;
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;

        //using slow fast pointers floyed's tortoise hare algo
    }

    public static void main(String[] args) {

        Custom<Integer> c1 = new Custom<>();
        c1.add(10); c1.add(20); c1.add(30);

        Custom<Integer> c2 = new Custom<>();
        c2.add(5); c2.add(15); c2.add(25); c2.add(40);

        Custom<Integer> merged = c1.merge(c1, c2);

        System.out.println(merged);
        System.out.println(merged.reverse());
        System.out.println(merged.middleEle());
    }
}
