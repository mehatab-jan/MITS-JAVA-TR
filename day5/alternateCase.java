import java.util.Scanner;

public class alternateCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(s);
        boolean flag = true;

        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);

            if(Character.isAlphabetic(c)){
                if(flag){
                    sb.setCharAt(i, Character.toUpperCase(c));
                } else{
                    sb.setCharAt(i, Character.toLowerCase(c));
                }
                flag = !flag;   // ✅ Move inside loop
            }
        }

        System.out.println(sb.toString());  // ✅ Print result
        sc.close();
    }
}