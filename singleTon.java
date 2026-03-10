public class singleTon {
    static singleTon ob;
    private singleTon(){
    }
    static singleTon getinstance(){
        if(ob==null)
            ob = new singleTon();
        return ob;
    } 
       String name1;
       String name2;
       String name3;
    public static void main(String[] args){
    ob = singleTon.getinstance();
    System.out.println(ob);
    singleTon obj = singleTon.getinstance();
    System.out.println(obj);
    ob.name1="Dell";
    ob.name2="Lenovo";
    ob.name3="Hp";
    System.out.println(ob.name1);
    System.out.println(ob.name2);
    System.out.println(ob.name3);
    obj.name1="Asus";
    obj.name2="Jio";
    obj.name3="Sony";
    System.out.println(obj.name1);
    System.out.println(obj.name2);
    System.out.println(obj.name3);



} 
}