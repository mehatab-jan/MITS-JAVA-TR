import java.util.Scanner;

class Person{
    private int age;
    public void setAge(int a){
        if(a>=0){
            age = a;
        }
    }
    public int getAge(){
        return age;
    }



}





public class GetterAndSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GetterAndSetter gs = new GetterAndSetter();
        Person ob = new Person();
        ob.setAge(25);
        ob.setAge(0);
        System.out.println(ob.getAge());

    }
    
}
