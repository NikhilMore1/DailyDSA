package EPAM.coding.Cursors;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0;i<11;i++){
            arrayList.add(i);
        }
        java.util.Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Integer ele = iterator.next();
            if (ele % 2!=0) {
                iterator.remove();
                System.out.println(ele);
            }
        }
    }
}
