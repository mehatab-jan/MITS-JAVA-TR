class A{
    A(){
        System.out.println("A");
    }

}
class B extends A{
    
    B(){
        this(10);
        


    
    }
    B(int i){
        super();
        System.out.println("B");
    }

}





public class SuperAndThis {
    public static void main(String[] args) {
        B ob = new B();
    }
    
}
