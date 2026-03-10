import java.util.ArrayList;
public class Arraylist {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(12);
        a1.add(53);
        a1.add(77);
        a1.addFirst(23);
        a1.addLast(15);
        // a1.add("abc");
        // a1.add("xyz");
        // a1.add(77.3);  if we insert any other data type values it shows error because we choose generic data type
        System.out.println(a1.get(0));
        System.out.println(a1.get(2));
        for(int i = 0;i<a1.size();i++ ){
            System.out.println(a1.get(i));
        }
        System.out.println();
        for(Integer i:a1){
            System.err.println(i);
        }


    }

    
}
