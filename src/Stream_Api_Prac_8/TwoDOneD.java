package Stream_Api_Prac_8;

import java.util.Arrays;
import java.util.List;

public class TwoDOneD {

    public static void main(String[] args) {
        //arr2d1d();
        list2d1d();
    }

    public static void arr2d1d() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println("2D :: " + Arrays.toString(arr));
        int[] arr2 = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        System.out.println("1D :: " + Arrays.toString(arr2));
    }

    public static void list2d1d() {
        List<List<Integer>> ll = List.of(
                List.of(3, 2, 1),
                List.of(6, 5, 4),
                List.of(9, 8, 7)
        );
        System.out.println("LL :: " + ll);
        List<Integer> l = ll.stream().flatMap(List::stream).toList();
        System.out.println("L :: " + l);
    }
}
