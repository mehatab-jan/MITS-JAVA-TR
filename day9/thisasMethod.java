class service {
    static void process(Task t){
        System.out.println(t);

    }
}
class Task{
    static Task o=new Task();

   static void start(){
       service.process(o);
   }
}
public class thisasMethod {
    public static void main(String args[]){
        Task.start();
    }
}