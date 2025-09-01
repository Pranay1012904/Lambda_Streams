package Stream_Api_Prac_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SamplePrac_1 {

    public static void main(String[] args) {
        String s = "Pranay";
        List<String> arr = Arrays.asList(s.split(""));
        System.out.println(arr);
        int[] intArr = {8, 7, 6, 5, 4, 3, 2, 1};
        List<Integer> iList = IntStream.of(intArr).boxed().toList();
        Integer[] arr3 = Arrays.stream(intArr).boxed().toArray(Integer[]::new);
        System.out.println(iList);
        listToInt(iList);
    }

    public static void listToInt(List<Integer> iList) {
        int[] arr = iList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
