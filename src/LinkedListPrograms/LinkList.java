package LinkedListPrograms;

public class LinkList {
    private Node head;
    private Node tail;

    private int size;
    public LinkList(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size = size+1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size = size+1;
    }
    public void deleteFirst(){
        head = head.next;
        if (head == null){
            tail = null;
        }
        size = size-1;
    }
    public int deleteLast(){
        Node temp = head;
        int count = 1;
        int idx = 0;
        while (temp!=null){
            if (temp.next == null){
                idx = count-1;
                Node temp1 =  deleteLastEle(idx);
                temp1.next = null;
                tail =  temp1;
            }
            temp = temp.next;
            count++;
        }
        return idx;
    }
    public Node deleteLastEle(int idx){
        Node temp = head;
        for (int i = 1;i<idx;i++){
            temp = temp.next;
        }
        return temp;
    }
    public void insertInMid(int val,int index){
        Node node = new Node(val);
        Node temp = head;
        int count = 0;
        while (temp!=null){
            if (count == index-1){
                node.next = temp.next;
                temp.next = node;
                size = size+1;
            }
            temp = temp.next;
            count++;
        }
    }
    public void update(int val,int idx){
        Node temp = getNode(idx);
        if (temp != null){
            temp.data = val;
        }
    }
    public Node getNode(int idx){
        Node temp = head;
        for (int i = 1;i<idx;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
        return temp;
    }
    public void display(){
        Node temp  = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }

    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }


    }

}
