class A{

}
class B extends A{


}
public class upcasting {
    public static void main(String[] args) {
         A ob = new B();//upcasting
    B obj = (B)ob;//downcasting
    System.out.println(ob instanceof A);
    System.out.println(ob instanceof B);
        
    }



    
}
