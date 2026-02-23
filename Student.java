import java.util.Scanner;

public class Student {
    String name;
    int id;
    Student(String name,int id){
        this.name = name;
        this.id = id;

    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        String name = sc.nextLine();
        System.out.println("enter id:");
        int id = sc.nextInt();
        Student st = new Student(name,id);
        st.display();




    }
}
