class parent{
    String name = "parent";
}
class child extends parent{
    String name = "child";
     void chil(){
        System.out.println(name);
        
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
public class supershawdow {
    public static void main(String[] args) {
        child c = new child();
        c.chil();
    }
    
}
