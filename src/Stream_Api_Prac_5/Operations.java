package Stream_Api_Prac_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Operations {

    public static void stringToListFrequency() {
        String nm = "Pranay";
        List<String> sList = Arrays.asList(nm.split(""));
        int frequency = Collections.frequency(sList, "a");
        System.out.println(frequency);
    }

    public static void intToInteger() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Integer[] iArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> iList = Arrays.asList(iArr);
        System.out.println(iList);
    }

    public static void binSearch() {
        //Long i=System.currentTimeMillis();
        int[] arr = {34, 12, 89, 90, 21, 78, 43};
        Arrays.sort(arr);
        System.out.println("Sorted Array ::" + Arrays.toString(arr));
        int ind = Arrays.binarySearch(arr, 78);
        System.out.println("Index ::" + ind);
    }

    public static void dToSArr() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("2D :: " + Arrays.toString(arr));
        int[] sArr = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        System.out.println("1D :: " + Arrays.toString(sArr));
        Integer[] iArr = Arrays.stream(sArr).boxed().toArray(Integer[]::new);
        List<Integer> iList = Arrays.asList(iArr);
        System.out.println(Integer.toBinaryString(10));
    }

    public static void arraysEquals() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};//{34, 12, 89, 90, 21, 78, 43};
        System.out.println(Arrays.equals(arr, arr2));
    }

    public static void d21DList_1() {
        var list = List.of(
                List.of(1, 2, 3, 4),
                List.of(5, 7, 8, 9)
        );
        System.out.println(list);
        var list1=list.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(list1);
    }
}
