package Stream_Api_Prac_6.twoDOneD;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Array3 {

    private static int[][] arr = {
            {23, 12, 21},
            {45, 11},
            {54, 32, 77}
    };

    public static void TwoDimToOneDim() {
        int[] arr1 = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        System.out.println("SDIM ARR :: " + arr1);
        boxing(arr1);
    }

    public static void boxing(int[] oD) {

        List<Integer> iList = IntStream.of(oD).boxed().toList();
        iList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("LIST :: " + iList);
    }
}
