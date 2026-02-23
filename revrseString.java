import java.util.Arrays;
import java.util.Scanner;

public class revrseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "broken laptop is given";
        String str[] = s.split("");
       // String str[] = s.split(" +");
        // System.out.println(Arrays.toString(str));
        // System.out.println(str[str.length-1]);
        // System.out.println(str[str.length-1].length());
        for(int i=0;i<str.length-1;i++){
            System.out.print(str[i]+"");
        }
        for(int i = str[str.length-1].length()-1;i>=0;i--){
            System.out.print(str[str.length-1].charAt(i));
        }


        
    }
}
