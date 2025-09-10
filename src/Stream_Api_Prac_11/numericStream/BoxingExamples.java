package Stream_Api_Prac_11.numericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BoxingExamples {

    public static void main(String[] args) {
        intToInteger(new int[]{1, 2, 3, 4, 5});
        listOfListsToList();
    }

    public static void intToInteger(int[] arr) {
        Integer[] a = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        System.out.println("INTEGER ARR ::" + Arrays.toString(a));
        List<Integer> iList = IntStream.of(arr).boxed().toList();
        System.out.println("INTEGER LIST ::" + iList);
    }

    public static void listOfListsToList() {
        var list = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

       List<Integer> iList= list.stream().flatMap(List::stream).toList();
        System.out.println("LIST ::"+iList);
    }
}
