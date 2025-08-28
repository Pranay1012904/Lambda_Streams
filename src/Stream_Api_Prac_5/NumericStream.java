package Stream_Api_Prac_5;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class NumericStream {

    public static void main(String[] args) {

    }

    public static void dStream() {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        int[] arr=integerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        OptionalDouble avg = IntStream.rangeClosed(1, 10).asDoubleStream().average();
    }

    public static void box() {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> iList = IntStream.of(arr)
                .boxed()
                .toList();
    }

}
