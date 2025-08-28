package Collections_Prac;

import StreamPracTwo.Map;
import java.util.*;

public class LinkedHashMap {

    public static void main(String[] args) {
        lHM();
    }

    static void lHM(){
        java.util.LinkedHashMap<Integer,Integer> lhm=new java.util.LinkedHashMap<>();
        lhm.put(1,23);
        lhm.put(2,26);
        lhm.put(3,21);
        lhm.put(5,29);
        lhm.forEach((k,v)->
                System.out.println("Key->"+k+"\tVal->"+v));
    }
}
