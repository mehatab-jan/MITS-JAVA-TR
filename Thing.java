// import java.util.Scanner;

// public class Thing {
//     private int count;
//       Thing(){
//         count++;
        

//         }
//          static void getcount(){
//             System.out.println(count);

//         }
//     }
        
//             public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             Thing ob = new Thing();
//             new Thing();
//             new Thing();
//             new Thing();
//             ob.getcount();
//         }
    
    

        
        
    

import java.util.Scanner;

public class Thing {

    private static int count;   // ✅ make static

    Thing() {
        count++;                // increases every time object is created
    }

    static void getcount() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Thing ob = new Thing();
        new Thing();
        new Thing();
        new Thing();

        ob.getcount();   // or Thing.getcount();
    }
}