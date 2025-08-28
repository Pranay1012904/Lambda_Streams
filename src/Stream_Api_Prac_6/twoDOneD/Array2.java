package Stream_Api_Prac_6.twoDOneD;

import java.util.Arrays;
import java.util.List;

public class Array2 {
    static final int[][] TWO_DIM = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
    };

    public static void TwoDOneD(){
        int[] arr=Arrays.stream(TWO_DIM)
                .flatMapToInt(Arrays::stream).toArray();
        System.out.println("TwoDToOneD ::"+Arrays.toString(arr));
        List<Integer> iList= Arrays.stream(arr).boxed().toList();
        System.out.println("LIST OF INTEGER ::"+iList);
    }
}
