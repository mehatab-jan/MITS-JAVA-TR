// public class labelledCheck {
//     public static void main(String[] args) {
//         hii:
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 if(j==2){
//                     break hii;
//                 }
//             System.out.println("i = " + i + " j = " + j);
//             }
//         }
//     }
// }

public class labelledCheck {
    public static void main(String[] args) {
        hii:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j==2){
                    continue hii;
                }
            System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}









