package Stream_Api_Prac_6.twoDOneD;

import java.util.Arrays;

public class Array1 {
    static final int[][] TWO_DIM = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
    };
    public static int[] s_dim = null;

    public static void arrayCon() {
        System.out.println("TWO DIM ARRAY");
        for (int[] s : TWO_DIM) {
            System.out.println(Arrays.toString(s));
        }
        System.out.println("SINGLE DIMENSIONAL CONVERTED ARRAY");
        s_dim = Arrays.stream(TWO_DIM).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(s_dim));
    }
}
