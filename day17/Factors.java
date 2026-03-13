public class Factors {

    static void fact(int n, int i) {
        if (i > n)
            return;

        if (n % i == 0)
            System.out.print(i + " ");

        fact(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 12;
        fact(n, 1);
    }
}