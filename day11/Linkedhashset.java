import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Linkedhashset {
    public static void main(String[] args) {
       
        LinkedHashSet<Integer> al2 = new LinkedHashSet<Integer>();
        
        al2.add(10);
        al2.add(20);
        al2.add(30);
        System.out.println(al2);
        System.out.println(al2.contains(10));
        System.out.println(al2.remove(10));
        System.out.println(al2);
        System.out.println(al2.isEmpty());
        System.out.println(al2.size());


    }
}

