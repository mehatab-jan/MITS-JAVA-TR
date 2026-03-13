import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle{
    public List<List<Integer>> generate(int n) {
         List<List<Integer>> l=rec(n);
         return l;
    }
        static List<List<Integer>>rec(int n) {
        if(n==0){
            return new ArrayList<>();
        }
        if(n==1){
            List<List<Integer>> l = new ArrayList<>();
             l.add(new ArrayList<>());
            l.get(0).add(1);
            return l;
        }
        List<List<Integer>> l= rec(n-1);
        List<Integer> c = new ArrayList<>();
        for(int i=0;i<n;i++) {
        	c.add(1);
        }
        for(int i=1;i<n-1;i++) {
        	c.set(i,(l.get(n-2).get(i-1))+(l.get(n-2).get(i)));
        }
        l.add(c);
        return l;
    }
    public static void main(String[] args) {
        PascalsTriangle ob = new PascalsTriangle();
        System.out.println(ob.generate(5));
    }
}
