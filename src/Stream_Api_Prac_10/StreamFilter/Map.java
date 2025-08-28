package Stream_Api_Prac_10.StreamFilter;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class Map {

    public static void getNames() {
        var names = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .toList();
        System.out.println(names);
    }

    public static void flatMap() {
        var activity = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream).toList();
        System.out.println(activity);
    }

    public static void customSort() {
        var std = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName)).toList();
        std.forEach(System.out::println);
    }
}
