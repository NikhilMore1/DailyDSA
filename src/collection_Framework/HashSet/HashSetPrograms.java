package collection_Framework.HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class HashSetPrograms {
    public static void main(String[] args) {
        int[] arr = new int[]{1,7,6,4,9,0,3,2,6,8,11,77,55};
        TreeSet<Integer> tree = new TreeSet<>();
        for (int ele:arr){
            tree.add(ele);
        }
        int k = new Scanner(System.in).nextInt();
        int i = 0;
        System.out.println(tree.floor(k));
        System.out.println(tree.ceiling(k));
    }
}
