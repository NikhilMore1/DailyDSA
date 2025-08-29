package collection_Framework.LinkedList;
 class CustomDLL<E>{
    private Node head;
    private Node tail;
    public static int size = 0;
    private class Node{
        E data;
        Node next;
        Node prev;

        Node(E data){
            this.data = data;
        }
    }
    public void add(E data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
            head.next = node;
            size++;
    }
    public void insertFirst(E data){
        Node node = new Node(data);
        node.next = head;
        if (head!=null){
            head.prev = node;
        }
        size++;
    }
    @Override
     public String toString(){
        if (size == 0){
            return "[]";
        }
        Node node = head;
        String data = "[";
        for (int i = 0;i<size;i++){
            data = data+node.data;
            node = node.next;
        }
        data = data+node.data;
        return data+" ]";
    }
}
public class CustomDoublyLL {
    public static void main(String[] args) {
        CustomDLL<Integer> list = new CustomDLL<>();
        list.add(10);
        System.out.println(list);
    }
}
