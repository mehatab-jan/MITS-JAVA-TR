import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] s = sc.nextLine().toCharArray();
        int l = 0; 
        int r = s.length-1;
        while(l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;

        }
        System.out.println(s);
        
    }
    
}
