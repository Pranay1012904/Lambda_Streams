package Stream_Api_Prac_10.StreamFilter;

import Data.StudentDataBase;

import java.util.List;

public class Filter {

    public static void filter1() {
        var femaleStd = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .toList();
        femaleStd.forEach(System.out::println);
    }

    public static void reduce_1() {
        var list = List.of(1, 2, 3, 4, 5);
        var p=list.stream()
                .reduce((a, b) -> a * b);
        System.out.println(p.get());
    }
}
