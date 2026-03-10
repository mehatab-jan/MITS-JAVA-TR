import java.util.LinkedList;
import java.util.Vector;

public class Linkedlist {
    public static void main(String[] args) {

        // LinkedList<Integer> al1 = new LinkedList<>();
        // LinkedList<Integer> al2 = new LinkedList<>();
        Vector<Integer> v = new Vector<Integer>();

        v.addFirst(3);
        v.addLast(99);

        v.removeFirst();
        v.removeLast();

        System.out.println(v);
    }
}