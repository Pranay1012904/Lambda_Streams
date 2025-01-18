package Collections_Prac;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet_1 {
    static Set<String> hS=new HashSet<>();
    public static void hashSet_1(){

        hS.addAll(Main.sList1);
        hS.addAll(Main.sList2);
        hS.forEach(System.out::println);
        hashSet_2(hS);
    }

    public static void hashSet_2(Set<String> hS){
        System.out.print("\n\nCOMBO\n\n");
        List<String> sL=hS.stream().filter(s-> !s.equalsIgnoreCase("pine") && !s.equalsIgnoreCase("wine")).toList();
        sL.forEach(System.out::println);
    }


}
