import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> al = new HashSet<Integer>();
        LinkedHashSet<Integer> al2 = new LinkedHashSet<Integer>();
        TreeSet<Integer> al3 = new TreeSet<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        System.out.println(al.contains(10));
        System.out.println(al.remove(10));
        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.size());


    }
}
