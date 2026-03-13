import java.util.Scanner;
public class Basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String s2=sc.nextLine();
        int pos = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    sb.insert(pos,s2);
    System.out.println(sb.toString());

    }
}
