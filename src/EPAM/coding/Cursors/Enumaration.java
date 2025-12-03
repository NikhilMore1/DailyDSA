package EPAM.coding.Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Enumaration {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0;i<10;i++){
            vector.add(i);
        }

        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            Integer ele = enumeration.nextElement();
            System.out.println(ele);
        }
        System.out.println(vector);
    }
}
