import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 0; 
        int r = s.length()-1;
        boolean flag = true;
        while (l<=r) {
            if(s.charAt(l)!=s.charAt(r)){
                flag = false;
                break;
            }
            l++;r--;
            
        }
        System.out.println(flag);


    }
    
}
