import java.util.Scanner;

public class StringBuilderConce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("meha");
        //String builder operations:
        System.out.println(sb.append("jan"));
        System.out.println(sb.insert(4,"tab"));
        System.out.println(sb.delete(0,4));
        System.out.println(sb.reverse());
        System.out.println(sb);

      

    }
}
