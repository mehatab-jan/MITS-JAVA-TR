import java.util.Scanner;

public class ZagedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int array[][] = new int[4][4];
        int new_arr[][] = new int[3][];
        new_arr[0] = new int[2];
        new_arr[1] = new int[6];
        new_arr[2] = new int[4];
        // for(int i = 0;i<new_arr.length;i++){
        //     int value = sc.nextInt();
        //     new_arr[i] = new int[value];
        // } 
        // System.out.println(new_arr[0].length);
        // System.out.println(new_arr[1].length);
        // System.out.println(new_arr[2].length);
        // new_arr[0][0]=20;
        // new_arr[0][1] = 30;
        // new_arr[1][0] = 40;
        // new_arr[1][1] = 50;
        // new_arr[1][2] = 60;
        // new_arr[1][3] = 70;
        // new_arr[1][4] = 80;
        // new_arr[1][5] = 90;
        // new_arr[2][0] = 100;
        // new_arr[2][1] = 110;
        // new_arr[2][2] = 120;
        // new_arr[2][3] = 130;

        // System.out.println(new_arr[0][0]);
        // System.out.println(new_arr[0][1]);
        // System.out.println(new_arr[1][0]);
        // System.out.println(new_arr[1][1]);
        // System.out.println(new_arr[1][2]);
        // System.out.println(new_arr[1][3]);
        // System.out.println(new_arr[1][4]);
        // System.out.println(new_arr[1][5]);
        // System.out.println(new_arr[2][0]);
        // System.out.println(new_arr[2][1]);
        // System.out.println(new_arr[2][2]);
        // System.out.println(new_arr[2][3]);
        for(int i = 0;i<new_arr.length;i++){
            for(int j = 0;j < new_arr[i].length;j++){
                new_arr[i][j] = sc.nextInt();
            }
        }
         for(int i = 0;i<new_arr.length;i++){
            for(int j = 0;j < new_arr[i].length;j++){
                System.out.print(new_arr[i][j]+" ");
            }
             System.out.println();
        }
       
        

    }
}
