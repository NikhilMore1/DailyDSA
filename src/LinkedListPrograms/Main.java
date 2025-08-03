package LinkedListPrograms;

public class Main {
    public static void main(String[] args) {
    CustomDoublyLinkedList<Integer>list = new CustomDoublyLinkedList<>();
    list.addFirst(10);
    list.addFirst(20);
    list.addFirst(30);
    list.addFirst(40);
    list.addLast(80);
    list.Display();
    list.addMid(2,100);
        list.Display();

    }
}
