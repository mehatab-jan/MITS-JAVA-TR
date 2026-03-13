import java.util.Arrays;
import java.util.Scanner;

public class Common {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input words separated by space
        String[] s1 = sc.nextLine().split(" ");

        Arrays.sort(s1);

        String first = s1[0];
        String last = s1[s1.length - 1];

        int count = 0;

        for(int i = 0; i < first.length() && i < last.length(); i++){
            if(first.charAt(i) == last.charAt(i)){
                count++;
            } else {
                break;
            }
        }

        if(count == 0)
            System.out.println("-1");
        else
            System.out.println(first.substring(0, count));
    }
}
