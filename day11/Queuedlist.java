import java.util.Collections;
import java.util.PriorityQueue;

public class Queuedlist {
    public static void main(String[] args) {
        PriorityQueue<Integer> ql = new PriorityQueue<>(Collections.reverseOrder()); // prints maxheap  Collections.reverseOrder() without this min heap
        ql.offer(10);
        ql.offer(2);
        ql.offer(30);
        ql.offer(4);
        System.out.println(ql.poll());
        System.out.println(ql.poll());
        System.out.println(ql.poll());
        
        System.out.println(ql.peek());
        ql.isEmpty();

    }
}
