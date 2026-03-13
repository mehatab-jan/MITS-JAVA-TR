import java.util.Stack;
public class Stackedlist {
    public static void main(String[] args){
        Stack<Integer> al = new Stack<Integer>(); 
        al.push(10);
        al.push(20);
        al.push(30);
        al.push(40);
        System.out.println(al);
        
        System.out.println(al.pop());
        System.out.println(al.isEmpty());

    }
    
}
