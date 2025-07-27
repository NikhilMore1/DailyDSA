package Generics;

public class Driver {
    public static void main(String[] args) {
        CustomMap<String,Integer>map = new CustomMap<>();
        map.setKey("Age",20);
        map.setKey("Age",30);
        System.out.println( map.getKeys());
        System.out.println(map.getValue());
    }
}
