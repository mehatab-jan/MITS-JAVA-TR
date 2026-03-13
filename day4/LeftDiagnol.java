import java.util.Scanner;

public class LeftDiagnol {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int new_arr[][] = new int[3][3];
        // int new_arr[][] = new int[3][];
        // new_arr[0] = new int[2];
        // new_arr[1] = new int[6];
        // new_arr[2] = new int[4];
        for(int i = 0;i<new_arr.length;i++){
            for(int j = 0;j < new_arr[i].length;j++){
                new_arr[i][j] = sc.nextInt();
                

                }
            }
        
         for(int i = 0;i<new_arr.length;i++){
            for(int j = 0;j < new_arr[i].length;j++){
                if(i>=j){
                     System.out.print(new_arr[i][j] + " ");

                }
               
            }
             System.out.println();
    }
}
}

