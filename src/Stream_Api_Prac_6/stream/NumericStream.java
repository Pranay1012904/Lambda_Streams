package Stream_Api_Prac_6.stream;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStream {
    public static void main(String[] args) {

    }

    public static void sample_1() {
        List<Integer> iList = List.of(1, 2, 3, 4, 5);
        //reduce sum
        int lSum = iList.stream().reduce(0, Integer::sum);
        iList.stream().mapToInt(Integer::intValue).sum();
        IntStream.rangeClosed(1, 6).asDoubleStream().average();
        OptionalInt max = IntStream.of(lSum).max();
        max.getAsInt();

    }
}
