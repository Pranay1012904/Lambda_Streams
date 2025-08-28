package Stream_Api_Prac_4;

import java.util.HashMap;

public class HashMap_Impl {

    public static void main(String[] args) {
        hashImpl();
    }

    public static void hashImpl(){
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put("A",1);
        hm.put("B",2);
        hm.put("C",3);
        hm.put("D",4);
        hm.put("E",5);

        hm.forEach((k,v)->{
            System.out.println(k+"->"+v);
        });
        System.out.println(hm.containsKey("D"));
    }
}
