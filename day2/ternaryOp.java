import java.util.Scanner;

public class ternaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int Score = sc.nextInt();
        String grade = ((100<=90)?"grade A":(89<=80)?"grade B":(69<=60)?"grade C":"fail");
        System.out.println(grade);
    }
}
