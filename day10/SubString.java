import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "Laptop";
        String s2 = "top";
        System.out.println(s1.substring(0,3));
        boolean flag = false;
       
        for(int i=0;i<s1.length()-s2.length();i++){
            if(s2.equals(s1.substring(i,i+s2.length()))){
                flag = true;
            }


        }
        System.out.println(flag);
       



        
    }
}
