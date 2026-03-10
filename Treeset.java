import java.util.TreeSet;
public class Treeset {
  

        public static void main(String[] args) {
       
            TreeSet<Integer> al = new TreeSet<Integer>();
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
    

