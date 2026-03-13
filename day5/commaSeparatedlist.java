// import java.util.Scanner;

// public class commaSeparatedlist {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         sc.nextLine();
//         //String arr[] = new String[size];
//         StringBuilder sb = new StringBuilder();
//         for(int i =0;i<size;i++){
//           String s = sc.nextLine();
//            // arr[i] = sc.nextLine();
//             if(i<size-1){
//                 sb.append(s+"");
            
//             }else{
//                 sb.append(s);
//             }
//         }
//         System.out.println(sb.toString());

//     }
// }



// 

//with array
import java.util.Scanner;

public class commaSeparatedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[size];
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<size;i++){
          //String s = sc.nextLine();
            arr[i] = sc.nextLine();
            if(i<size-1){
                sb.append(arr[i]+",");
            
            }else{
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());

    }
}