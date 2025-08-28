package Stream_Api_Prac_8.Stream;

import Data.Student;
import Data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PracMap {

    public static void main(String[] args) {
        //p1();
        //p2();
        //p3();
        //p4();
        p5();
    }

    public static void p1() {
        List<String> names = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName).toList();
        System.out.println(names);
    }

    public static void p2() {
        var act = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted()
                .toList();
        System.out.println(act);
    }

    public static void p3() {
        var std = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
        std.forEach(System.out::println);
    }

    public static void p4() {
        var std = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .toList();
        std.forEach(System.out::println);
    }

    public static void p5() {
        var list= Arrays.asList(1,2,3,4,5);
        var p=list.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println(p);
    }
}
