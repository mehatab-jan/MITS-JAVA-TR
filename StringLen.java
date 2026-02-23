import java.util.Arrays;
import java.util.Scanner;

public class StringLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "dell";
        char ch [] = s.toCharArray();
        // System.out.println(ch[0]);
        // System.out.println(ch[1]);
        // System.out.println(Arrays.toString(ch));
        int count = 0;
        for(char c : s.toCharArray()){
            count++;
        }
        System.out.println(count);



    }
}
