package Streams;

import java.util.ArrayList;
import java.util.List;

public class ImperativeDeclarative {

    public static void Imperative(List<Integer> intList){
        List<Integer> uniqueList=new ArrayList<>();
        for(Integer i:intList){
            if(!uniqueList.contains(i))
                uniqueList.add(i);
        }
        System.out.print("\n\nIMPERATIVE:"+uniqueList);
    }

    public static void Declarative(List<Integer> intList){
          List<Integer> uniqueList=intList.stream().distinct().toList();
          System.out.print("\n\nDECLARATIVE:"+uniqueList);
    }
}
