
class User{
    static String Username;
    static String Userrole;
    private User(String name){
        Username = name;
        Userrole = "Admin";

    }
    
    public static User createAdmin(String name){
        return new User(name);



    }
    static void display(){
        System.out.println("user;"+Username+"Role:"+Userrole);
    }
    public static void main(String[] args){
        User.createAdmin("Alice");
        User.display();
    }
}



public class Staticfact {
    
}
