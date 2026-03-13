class TryExample {
    public static void main(String[] args) {

        try {
            int num = 10 / 0;
            int arr[] = null;

            System.out.println(arr.length);
            return;

            // System.exit(0);  // optional
        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }

        catch (NullPointerException n) {
            System.out.println(n);
            System.out.println("You passed null value to that variable");
        }

        catch (Exception last) {
            System.out.println(last);
            System.out.println("I got it...");
        }

        finally {
            System.out.println("Completed");
        }
    }
}