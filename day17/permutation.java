import java.util.ArrayList;
import java.util.List;

class Permutation {
    public List<String> letterCasePermutation(String s) {
        List<String> output = new ArrayList<>();
        rec(s.toCharArray(),0,output);
        return output;
    }
    void rec(char ch [], int index, List<String> output ){
            if(index==ch.length){
                output.add(new String(ch));
                return;
            }
            if(Character.isLetter(ch[index])){
                ch[index]=Character.toLowerCase(ch[index]);
                rec(ch,index+1,output);

                ch[index]=Character.toUpperCase(ch[index]);
                 rec(ch,index+1,output);
            }else{
                rec(ch,index+1,output);
            }
    }
}
class Main{
    public static void main(String[] args) {
        Permutation ob = new Permutation();
        System.out.println(ob.letterCasePermutation("a1b2"));
    }
}