public class fibonacci {
    int rec(int num){
        if(num<=1){
            return num;
        }
    return rec(num-1) + rec(num-2);
    }
public static void main(String[] args) {
    fibonacci fb = new fibonacci();
    System.out.println(fb.rec(5));
    for(int i=0;i<10;i++){
        System.out.println(fb.rec(i));
    }
}

}
