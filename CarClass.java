import java.util.Scanner;

public class CarClass {
   
    int year;
    String model;
    String make;
    CarClass(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void display(){
        System.out.println(" Year:" + year + " Make:" + make + " Model: " + model);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // CarClass cs = new  CarClass(sc.nextLine(),sc.nextLine(),sc.nextInt());
        // cs.display();
        CarClass csc = new  CarClass("corolla","tesla",2000);
        csc.display();


        // System.out.println("year:");
        // int year = sc.nextInt();
        // System.out.println("model:");
        // sc.nextLine();

        // String model = sc.nextLine();
        //  sc.nextLine();
        // System.out.println("make:");
        // String make = sc.nextLine();
        



    }
}

