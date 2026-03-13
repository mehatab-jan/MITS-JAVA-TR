import java.util.Scanner;

public class indexOfFirstOccurence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s2.length() > s1.length()) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i <= s1.length() - s2.length(); i++) {

            if (s2.equals(s1.substring(i, i + s2.length()))) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}