package day5;
// import java.util.HashSet;
// import java.util.Scanner;

// public class register {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         HashSet<Integer> cus = new HashSet<>();
//         int id = sc.nextInt();
//         while(true){
//             if(cus.contains(id)){
//             System.out.println("customer already existed");
//         }
//         else{
//             cus.add(id);
//             System.out.println("new customer registered");
//         }

//         }
        
//     }
// }


import java.util.*;

public class register {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> customers = new HashSet<>();

        while(true){

            int id = sc.nextInt();

            if(customers.contains(id)){
                System.out.println("customer already exists");
            }
            else{
                customers.add(id);
                System.out.println("new customer registered");
            }
        }
    }
}
