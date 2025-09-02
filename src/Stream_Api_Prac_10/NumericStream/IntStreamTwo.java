package Stream_Api_Prac_10.NumericStream;

import Data.Student;
import Data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamTwo {

    public static void main(String[] args) {
        //listOfListToList();
        //arraysOfArrays();
        collecting();
    }

    public static void intToList() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        var list = IntStream.of(arr).boxed().toList();
        int[] arr1 = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr1));
    }

    public static void listOfListToList() {
        List<List<Integer>> list = List.of(
                List.of(5, 4, 3, 2),
                List.of(1, 2, 9, 12),
                List.of(15, 24, 13, 42)
        );
        List<Integer> iList = list.stream().flatMap(List::stream).toList();
        System.out.println(iList);
    }

    public static void arraysOfArrays() {
        int[][] arr = {
                {1, 2, 3},
                {11, 12, 13},
                {21, 22, 23},
        };

        int[] iArr = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        System.out.println(iArr);
        IntStream.of(iArr).min();
    }

    public static void collecting() {
        String s = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(" , ", "( ", " )"));
        System.out.println(s);

        long count = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.counting());
        System.out.println(count);
    }
}
