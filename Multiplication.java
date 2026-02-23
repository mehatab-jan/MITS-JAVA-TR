import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int j = sc.nextInt();
        for(int i = 1;i<11;i++){
            

            System.out.println(i+"*"+j+"="+(i*j));
        }
    }
}
