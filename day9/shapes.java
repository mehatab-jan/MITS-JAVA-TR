import java.util.Scanner;

class Shape{
    void calculateArea(){

    }
}
class circle extends Shape{
    
    int r;
    circle(int r){
        this.r=r;
    }

    void calculateArea(){
        System.out.println(Math.PI*r*r);
    }
}
class rectangle extends Shape{
    int l; 
    int w;
    rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }
        void calculateArea(){
            System.out.println(l*w);

        }
    }
public class shapes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int l = sc.nextInt();
        int w = sc.nextInt();
        Shape s ;
        s = new circle(r);
        s.calculateArea();
        s = new rectangle(l,w);
        s.calculateArea();
    }
}

