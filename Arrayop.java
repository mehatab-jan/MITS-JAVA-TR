import java.util.ArrayList;
import java.util.LinkedList;

public class Arrayop {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(53);
        al.add(77);
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.addAll(al);
        System.out.println(al);
        System.out.println(al2);
        LinkedList<Integer> al1 = new LinkedList<Integer>();
        al1.addAll(al);
        System.out.println(al1);

    }
    
}
