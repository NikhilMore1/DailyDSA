package LinkedListPrograms;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(10);
        list.insertFirst(12);
        list.insertFirst(30);
        list.insertFirst(50);
        list.insertLast(1000);
        list.insertFirst(12);
        list.insertFirst(30);
        list.insertFirst(50);
        list.insertInMid(2000,3);
        list.deleteFirst();
//        list.deleteLast();
        list.deleteLast();
        list.update(80,7);
        list.display();
    }
}
