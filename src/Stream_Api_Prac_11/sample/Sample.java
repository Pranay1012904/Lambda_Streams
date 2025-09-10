package Stream_Api_Prac_11.sample;

import java.util.List;
import java.util.stream.IntStream;

public class Sample {

    public static void main(String[] args) {
        //sum1-100- declarative style
        int sum = IntStream.rangeClosed(1, 100).sum();
        //System.out.println("SUM :: " + sum);
        unique();
    }

    public static void unique() {
        var list = List.of(23, 45, 12, 23, 78, 99, 45, 0);
        var unique = list.stream().distinct().toList();
        System.out.println(unique);
    }
}
