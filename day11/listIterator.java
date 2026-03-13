import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listIterator {
    public static void main(String[] args) {
        //Interface object creation
        List<Integer> l = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        ArrayList<Integer> al = new ArrayList<>();
        a1.add(12);
        a1.add(53);
        a1.add(65);
        ListIterator<Integer> il = a1.listIterator();
        while(il.hasNext()){
            int in = il.next();
            if(in==77){
                il.add(10);
                System.out.println(in);
            }
        while(il.hasPrevious()){
            il.remove();
            System.out.println(il.previous());
        }
        }
        // System.out.println(il.hasNext());
        //  System.out.println(il.next());

        // System.out.println(il.hasPrevious());
        Iterator<Integer> ali = a1.iterator();
        while(ali.hasNext()){
            System.out.println(ali.next());
        }
       
    }
}
