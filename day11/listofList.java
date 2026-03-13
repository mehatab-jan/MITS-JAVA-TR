import java.util.ArrayList;
import java.util.List;

public interface listofList {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        List<Integer> l2 = new ArrayList<>();
        l2.add(100);
        l2.add(120);
        l2.add(130);
        List<ArrayList<Integer>> ll = new ArrayList<>();
        ll.add(new ArrayList<>());
        ll.get(0).add(500);
        ll.get(0).add(501);
        System.out.println(ll.get(0));
        ll.add(l2);
        

    }
}
