import java.util.Scanner;

public class AuthorClass {
    String title;
    String author;
    AuthorClass(String title,String author){
        this.title = title;
        this.author=author;
    }
    AuthorClass(String title){
        this.title = title;
        this.author="unknown";
    }
    void display(){
        System.out.println("Title: " +title);
        System.out.println("Author: "+author);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter title:");
        String title = sc.nextLine();
        
        System.out.println("enter author:");
         String author = sc.nextLine();
       
        AuthorClass ac = new AuthorClass(title,author);
        ac.display();



    }
}
