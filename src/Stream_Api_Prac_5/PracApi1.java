package Stream_Api_Prac_5;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PracApi1 {

    public static void main(String[] args) {
        //peek();
        //map_1();
        //map_2();
        //map_3();
        //reduce();
        //reduce_2();
//        reduce_3();
        //reduce_4();
        //reduce_5();
        reduce_8();
    }

    public static void peek() {
        var list = List.of(2, 12, 23, 21, 45, 54, 23, 21);
        var newList = list.stream().map(s -> s * 2)
                .peek(s -> {
                    System.out.println(s);
                }).toList();
    }

    public static void map_1() {
        List<String> sList = StudentDataBase.getAllStudents()
                .stream().map(Student::getName)
                .sorted()
                .toList();
        System.out.println(sList);
    }

    public static void map_2() {
        List<String> actList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(actList);
    }

    public static void map_3() {
        List<Student> sList = StudentDataBase.getAllStudents()
                .stream().sorted(Comparator.comparing(Student::getName))
                .toList();
        sList.forEach(System.out::println);
    }

    public static void filter_1() {
        List<Student> studentList = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .toList();
        System.out.println(studentList);
    }

    public static void reduce() {
        var list = List.of(2, 12, 23, 21, 45, 54, 23, 21);
        var sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void reduce_2() {
        Double sum = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .map(Student::getGpa)
                .reduce(0d, Double::sum);
        System.out.println(sum);
    }

    public static void reduce_3() {
        Double max = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getGpa)
                .reduce(Double.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(max);
    }

    public static void reduce_4() {
        int sum = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce(0, (a, b) -> a + b);
        System.out.println("TOTAL NOTE BOOKS::" + sum);
    }

    public static void reduce_5() {
        int total = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGradeLevel() >= 3)
                .map(Student::getNoteBooks)
                .reduce(0, (a, b) -> a + b);
        System.out.println(total);
    }

    public static void reduce_6() {
        int sum = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGradeLevel() >= 3 && s.getGender().equalsIgnoreCase("female"))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void reduce_7() {
        var list = List.of(2, 12, 23, 21, 45, 54, 23, 21);
        var max=list.stream().reduce((a,b)->a>b?a:b);
        System.out.println(max);
    }

    public static void reduce_8() {
        Optional<Student> std=StudentDataBase.getAllStudents()
                .stream()
                .reduce((a,b)->a.getNoteBooks()>b.getNoteBooks()?a:b);
        System.out.println(std.get());
    }
}
