public class rec {
    void rec1(int num) {
        if (num > 10) {
            return;
        }

        System.out.println(num);   // print number
        rec1(num + 1);              // recursive call
    }

    public static void main(String[] args) {
        rec ob = new rec();
        ob.rec1(1);
    }
}