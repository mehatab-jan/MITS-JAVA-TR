class Parent{
     void who(){
        System.out.println("Parent");
    }
}
class child extends Parent{
   @Override
   void who(){
    System.out.println("Child");
   }
   void test(){
    this.who();
    super.who();
   }
   

}





public class SuperthisMethod {
    public static void main(String[] args) {
         child ob  = new child();
         ob.test();
    }
    
}
