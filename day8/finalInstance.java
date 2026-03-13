






// public class finalInstance {
//     final int Id;
//     finalInstance(){
//         Id = 1;
//     }
    
//     public static void main(String[] args) {
//         finalInstance ob = new finalInstance();
//         System.out.println(ob.Id);
//         ob.Id=2;
//     }
// }





public class finalInstance {
    static final int MAX_USERS = 100;
    
    public static void main(String[] args) {
        finalInstance ob = new finalInstance();
        System.out.println(finalInstance.MAX_USERS);
        
    }
}
