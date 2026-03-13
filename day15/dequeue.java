import java.util.ArrayDeque;

public class dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> de = new ArrayDeque<Integer>();
        //normal queue operation
        de.addLast(10);
        System.out.println(de);
        de.add(20);
        System.out.println(de);
        de.removeFirst();
        System.out.println(de);
        de.addFirst(5);
        de.removeLast();


    }
}
