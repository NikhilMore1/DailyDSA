package collection_Framework.PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.add(200);
        priorityQueue.add(100);
        priorityQueue.add(20);
        priorityQueue.add(2);
        priorityQueue.add(22);
        priorityQueue.add(221);
        priorityQueue.add(1);
        System.out.println(priorityQueue);
        ArrayList<Integer> arrayList = new ArrayList<>(priorityQueue);
        System.out.println(arrayList);
//        for (int i = 0;i<priorityQueue.size();i++){
//            System.out.println(priorityQueue.poll());
//        }
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
