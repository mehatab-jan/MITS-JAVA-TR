import java.util.Scanner;

public class Rectangle {
    int a,b;
    Rectangle(int a,int b){
        this.a = a;
        this.b = b;

    }
    void scale(double factor){
        System.err.println(a+b);
        System.out.println("a:"+(int)(a*factor)+"b:"+(int)(b*factor));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rc = new Rectangle(10,20);
        System.out.println("a:"+(rc.a)+"b:"+(rc.b));
        rc.scale(2.0);

    }
}
