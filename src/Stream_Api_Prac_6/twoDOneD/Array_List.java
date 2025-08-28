package Stream_Api_Prac_6.twoDOneD;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Array_List {

    private static int[][] arr={
            {2,3,5},
            {1,8,3,9},
            {21,12,99,21}
    };

    public static List<List<Integer>> iList=List.of(
            List.of(9,8,7,6),
            List.of(1,2,3),
            List.of(19,8,17,6)
    );

    public static void flatArr(){

        int[] arr2=Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println("Single Array::"+Arrays.toString(arr2));
        boxing(arr2);
    }

    public static void flatList(){
        List<Integer> sList=iList.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(sList);
    }

    public static void boxing(int[] arr){
        System.out.println("LIST::"+IntStream.of(arr).boxed().toList());
    }
}
