class Single {

    private static Single instance;

    // Private constructor
    private Single() {
    }

    // Public method to get instance
    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }
}

public class TestSingleton {
    public static void main(String[] args) {

        Single s1 = Single.getInstance();
        System.out.println(s1);

        Single s2 = Single.getInstance();
        System.out.println(s2);

        System.out.println(s1 == s2);  // true
    }
}