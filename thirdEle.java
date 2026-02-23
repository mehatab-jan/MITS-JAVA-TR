public class thirdEle {
    
    public static void main(String[] args) {
        byte arr[]={11,0,-40,51,32,-58,85};
int first=arr[0];
int second=Byte.MIN_VALUE;
int third=Byte.MIN_VALUE;
int fpos=0;
int spos=0;
int tpos=0;
for(int i=1;i<arr.length;i++){
    if(first>arr[i]){
        third=second;
        second=first;
        first=arr[i];
        fpos=i;
    }    
    
else if(second>arr[i] && arr[i]>=first&&fpos!=spos){
        third=second;
        second=arr[i];
        spos=i;
    }
    else if(third>arr[i] && arr[i]>=second&&tpos!=spos){
        third=arr[i];
        tpos=i;
    }
} 
System.out.println(third);
    }
}

