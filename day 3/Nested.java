public class Nested{
    class test{
        void display(){
            System.out.println("Java");

        }
        static void print(){
            System.out.println("print");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Nested ns = new Nested();
        Nested.test ts = ns.new test();
        Nested.ts.print();
    }
}