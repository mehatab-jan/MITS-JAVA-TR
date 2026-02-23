import java.util.Scanner;

public class primegenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num = 2;
        while (count < n) {
            check:
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    break check;   // not a prime
                }
            }
            boolean prime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
    }
}
}
