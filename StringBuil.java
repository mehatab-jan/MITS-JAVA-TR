import java.util.Scanner;
public class StringBuil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Laptop");
        String s = new String("Laptop");
        System.out.println(s.equals(sb));
        System.out.println(s.equals(sb.toString()));
        s=sc.nextLine();
        StringBuilder sb2= new StringBuilder(s);
        System.out.println(sb2);

        //StringBuilder extends AbstractStringBuilder
        //SrtingBuffer extends  AbstractStringBuilder

        //StringBuffer   //safe thread    //slow than StringBuilder
        //StringBuilder  // Not safe   //Fast
        

        // System.out.println(s.length()); //0
        // System.out.println(sb.length()); //0
        // s="laptop";
        // s=s+s;
        // sb.append("11223344556677889");
        // System.out.println(s.length());  //6
        // System.out.println(sb.length());  //17
        // System.out.println(s);
        // System.out.println(sb);
        // System.out.println(sb.capacity());   //34

        // System.out.println(sb);   //11223344556
        // System.out.println(sb.reverse());  //65544332211
        // System.out.println(sb);
        // System.out.println(sb.charAt(0));   //6
        // System.out.println(sb.insert(0,"00")); //0065544332211
        // System.out.println(sb); 
        // System.out.println(sb.replace(0,3,"-1"));  //-15544332211
        // System.out.println(sb.delete(0,1));  //15544332211  //multiple char delete 
        // System.out.println(sb.deleteCharAt(2));  //1544332211  //single char delete
        // System.out.println(sb.isEmpty());     //false 
        // System.out.println(sb.equals("1544332211"));  //true
        // System.out.println(sb.substring(4));  //332211
        // System.out.println(sb.substring(0,4));  //1544
        // System.out.println(sb.toString());       // builder-> String


    }
}
