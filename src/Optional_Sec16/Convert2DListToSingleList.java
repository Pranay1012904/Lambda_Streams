package Optional_Sec16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert2DListToSingleList {

    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l1= Arrays.asList(1, 2, 3);
        List<Integer> l2=List.of(4,5,6);
        List<Integer> l3=List.of(7,8,9);
        list.add(l1);
        list.add(l2);
        list.add(l3);
        System.out.println("\nLIST of LISTS::"+list);
        conversion(list);
    }

    static void conversion(List<List<Integer>> list){
       var singleList= list.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(singleList);
    }
}
