package Stream_Api_Prac_2;

import java.util.Arrays;
import java.util.List;

public class Conversion_2D_1D_1 {
    static final int[][] arr={{1,2},{3,4},{5,6}};
    static final List<List<Integer>> ll=List.of(
            Arrays.asList(1,2,3),
            Arrays.asList(4,5,6),
            Arrays.asList(7,8,9),
            Arrays.asList(10,11,12)
    );
    public static void main(String[] args) {
        arrCon();
        l1D();
    }

    static void arrCon(){
        int[] iArr=Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        Integer[] arrI=Arrays.stream(iArr).boxed().toArray(Integer[]::new);
        List<Integer> list= Arrays.asList(arrI);
        System.out.println(list);
    }

    static void l1D(){
       List<Integer> iList= ll.stream().flatMap(List::stream).toList();
        System.out.println(iList);
    }


}
