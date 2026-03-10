import java.util.*;
class validparenthesis {
    char data;
    validparenthesis link;
    validparenthesis head;

        void push(char c){
            validparenthesis newNode = new validparenthesis();
            newNode.data=c;
            if(head==null){
                head=newNode;
            }else{
                newNode.link=head;
                head=newNode;
            }
        }
        void pop(){
            if(!isEmpty()){
                head=head.link;
            }
        }
        char peek(){
                if(!isEmpty()){
                return head.data;
            }
            return '*';
        }
        boolean isEmpty(){
            return head==null;
        }
    public boolean isValid(String s) {
        validparenthesis ob = new validparenthesis();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch =='[' || ch == '{'){
                ob.push(ch);
            }else{
                if(ob.isEmpty()){
                    return false;
                }
                if((ch==')' && ob.peek()!= '(') ||
                (ch==']' && ob.peek()!='[')  ||
                (ch=='}' && ob.peek()!='{')  ){
                    return false;
                }
                ob.pop();
            }
        }
        return ob.isEmpty();
    }

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String s = sc.nextLine();

        validparenthesis obj = new validparenthesis();

        boolean result = obj.isValid(s);

        if(result){
            System.out.println("Valid Parentheses");
        }else{
            System.out.println("Invalid Parentheses");
        }

        sc.close();
    }
}

