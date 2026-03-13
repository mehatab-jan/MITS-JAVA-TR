import java.util.Scanner;

public class Box {
    int i ;
    int w;
    int h;
    Box(){
        i = w = h = 1;

    }
    Box(int i,int w,int h){
        this.i = i;
        this.w = w;
        this.h = h;


    }
    void display(){
        System.out.println("Box: "+ i + "*" + w + "*" +h); 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Box b = new Box();
        Box b1 = new Box(5,6,7);
        b.display();
        b1.display();
    }
    
}
