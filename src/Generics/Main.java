package Generics;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("www");
        box.setValues("k");
        System.out.println(box.getItem());
        System.out.println(box.getValues());

    }
}
