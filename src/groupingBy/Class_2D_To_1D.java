package groupingBy;

import java.util.Arrays;
import java.util.List;

public class Class_2D_To_1D {
    static final int[][] arr={{1,2},{3,4},{5,6}};
    static final List<List<Integer>> list=List.of(
            Arrays.asList(1,2,3,4),
            Arrays.asList(5,6,7,8)
    );

    public static void main(String[] args) {
        to1DArray();
        toSingleList();
    }
    static void to1DArray(){
        int[] opArr=Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(opArr));
        List<Integer> iList=Arrays.asList(Arrays.stream(opArr).boxed().toArray(Integer[]::new));
        System.out.println(iList);
    }

    static void toSingleList(){
       List<Integer> myList= list.stream().flatMap(List::stream).toList();
        System.out.println(myList);
        System.out.println("PROCESSORS:"+Runtime.getRuntime().availableProcessors());
    }
}
