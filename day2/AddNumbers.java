package day2;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter a numer");
        // int n = 0;
        // int sum = 0;

        // for(int i=0;i!=0;i++){
        //     int num = sc.nextInt();
        //     sum = sum + n;
        //     break;

        // }
        // System.out.println(sum);
        
        // if (n == 0){
        //     System.err.println("stop the loop");
        // }
        int n = 0;
        int s = 0;
        do{
            n = sc.nextInt();
            s = s+n;
        }while(n!=0);
        System.out.println(s);

    }
}
