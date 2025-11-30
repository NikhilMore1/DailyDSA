package EPAM.coding.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueDriver {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0;i<100;i++){
            queue.offer(i);
        }
//        Arrays
        System.out.println(queue);
    }
}
