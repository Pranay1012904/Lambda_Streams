package Stream_Api_Prac_10.Conversions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

    }

    public static void sToArr() {
        String s = "Pranay";
        StringBuffer sb = new StringBuffer("Pranay");
        s.contentEquals(sb);
        List<String> l = Arrays.asList(s.split(""));
        int[] iArr = {1, 2, 3, 4, 5};
        Integer[] IArr = Arrays.stream(iArr).boxed().toArray(Integer[]::new);
        List<Integer> iL = IntStream.of(iArr).boxed().toList();
        int[] rr=iL.stream().mapToInt( Integer::intValue).toArray();
        Integer i=67;

    }
}
