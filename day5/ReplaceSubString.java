import java.util.Scanner;
public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ="mississippi";
        String sub ="iss";
        String re= "ox";
        StringBuilder sb = new StringBuilder(s);
        int index=s.indexOf(sub);
        System.out.println(index);
        while(index!=-1){
            sb.replace(index, index+sub.length(),re);
            System.out.println(sb);
            index=sb.indexOf(sub,index+re.length());
            System.out.println(index);
        }
        System.out.println(sb.toString());
    }
}