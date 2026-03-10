 class trailingzero {
    
    public int trailingZeroes(int n) {
       
        if(n==0) return 0;
        return n/5 + trailingZeroes(n/5);
        
        
    }
    public static void main(String[] args) {
        trailingzero tz = new trailingzero();
        System.out.println(tz.trailingZeroes(20));
    }
}
    

