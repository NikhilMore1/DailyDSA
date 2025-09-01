package collection_Framework.HashSet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(102);
        set.add(300);
        set.add(500);
        set.add(600);
        set.add(500);
        set.add(6000);
        set.forEach(System.out::println);
    }
}