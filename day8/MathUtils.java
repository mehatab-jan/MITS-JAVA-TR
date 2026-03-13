import java.util.Scanner;

public class MathUtils {
    void add(int a,int b){
        System.out.println(a+b);
    }
    static void multiply(int a,int b){
        System.out.println(a*b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathUtils mu = new MathUtils();
        mu.add(10,20);
        MathUtils.multiply(10,20);
        

    }
}
