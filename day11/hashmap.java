import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hs = new HashMap<Integer,String>();
        hs.put(1,"meha");
        hs.put(2,"jaan");
        hs.put(3,"nuri");
        hs.put(2,"its mee");
        System.out.println(hs.get(1));
        System.out.println(hs.get(3));
        System.out.println(hs.get(2));
        hs.remove(2);
        System.out.println(hs.containsKey(2));
        System.out.println(hs.containsValue("its mee"));
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs.size());
        System.out.println(hs.getOrDefault(7,"no key"));


        for(int i : hs.keySet()){
            System.out.println(i);

        }
        for(String s : hs.values()){
            System.out.println(s);
        }
        for(HashMap.Entry<Integer,String> es:hs.entrySet()){
            System.out.println(es.getKey()+":"+es.getValue());
        }


    }
}
