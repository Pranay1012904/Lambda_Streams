package Stream_Api_Prac_7.Conversions;

import java.util.Arrays;
import java.util.List;

public class Convert {

    public static void stringToList() {
        String s = "Pranay";
        List<String> sList = Arrays.asList(s.split(""));
        System.out.println("String As List:" + sList);
    }

    //converting int[] to List<Integer>
    public static void intToList() {
        final int[][] TWO_DIM = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int[] arr = Arrays.stream(TWO_DIM).flatMapToInt(Arrays::stream).toArray();

        List<Integer> aList=Arrays.stream(arr).boxed().toList();
        aList.stream().mapToInt(Integer::intValue).toArray();
    }
}
