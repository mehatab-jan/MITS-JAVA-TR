import java.util.Scanner;

public class Methods {
    void print(); // method declaration
    void display(){ //method defnition
        System.out.println("disp"); //witout argument with return
        return;
    }
    int play(){
        return 10; //without argument with return
    }
    double walk(int km){ //with argument with return
        return km+10;
    }
    void speak(int time){
        System.out.println(time); // with argument without return
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods Me = new Methods();
        Me.display(); //method call
    }

}
