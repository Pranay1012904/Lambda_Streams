package Stream_Api_Prac_10.NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStream1 {

    public static void intStream_1() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("INT:" + IntStream.of(arr).sum());
        double d = IntStream.of(arr).asDoubleStream().sum();
        System.out.println("Double:" + d);
        float a;
    }

    public static void iI() {
        int[] arr = {1, 2, 3, 4, 5};
        var list = IntStream.of(arr).boxed().toList();
        System.out.println(list);
    }

    public static void iI2() {
        var lL= List.of(
                List.of(1,2,3),
                List.of(4,5,6),
                List.of(7,8,9)
        );
        var l=lL.stream().flatMap(List::stream).toList();
        System.out.println(l);
    }

    public static void a1A(){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[] oA=Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
    }
}
