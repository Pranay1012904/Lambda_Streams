package Optional_Prac;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

public class Arrays_Prac {
    static int[][] arr={{3,4},{1,2},{7,8},{5,6}};
    static List<List<Integer>> list= List.of(
            Arrays.asList(3,5,7),
            Arrays.asList(41,2,3)
    );
    public static void main(String[] args) {
        //arraysImpl();
        //boxedOneD();
        lLToL();
    }

    static void arraysImpl(){
        int[] oneD= Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(oneD));
        Arrays.sort(oneD);
        System.out.println(Arrays.toString(oneD));
        int key=Arrays.binarySearch(oneD,7);
        System.out.println(key);
    }

    static void boxedOneD(){
        int[] a=Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        Integer[] iA=Arrays.stream(a).boxed().toArray(Integer[]::new);
        List<Integer> iList=Arrays.asList(iA);
        System.out.println(iList);
    }

    static void lLToL(){
        System.out.println(list.stream().flatMap(List::stream).toList());
        WeakHashMap<Integer,String> whm=new WeakHashMap<>();
    }
}
