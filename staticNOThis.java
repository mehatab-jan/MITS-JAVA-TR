class A{
    int instanceVar = 10;
    static void myMethod(){
        System.out.println(this.instanceVar);
    }
}


public class staticNOThis {
    public static void main(String[] args) {
        A ob = new A();
        ob.myMethod();
    }
    
}
