import java.util.Arrays;
public class DynamicClimbingStairs{
    int arr[];
    int rec(int n){
        if(n<=1){
            return 1;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        arr[n]=rec(n-1)+rec(n-2);
        return arr[n];
    } 
    public static void main(String[] args){
        DynamicClimbingStairs ob=new DynamicClimbingStairs();
        int n=5;
        ob.arr=new int[n+1];
        Arrays.fill(ob.arr,-1);
        System.out.println(Arrays.toString(ob.arr));
        System.out.println(ob.rec(n));
        System.out.println(Arrays.toString((ob.arr)));
    }
}