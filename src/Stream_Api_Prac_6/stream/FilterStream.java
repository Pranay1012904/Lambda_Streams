package Stream_Api_Prac_6.stream;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FilterStream {

    public static void f_1() {
        List<Student> fList = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .toList();
        fList.forEach(System.out::println);
    }

    public static void f_2() {
        Double sum = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .map(Student::getGpa)
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println("GPA SUM : " + sum);
    }

    public static void f_3() {
        Optional<Student> std = StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
        System.out.println(std.get());
    }

    public static void f_4() {
        Optional<Student> std = StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
        System.out.println(std.get());
    }

    public static void f_5() {
        int sum = StudentDataBase.getAllStudents()
                .stream()
                .mapToInt(Student::getNoteBooks)
                .sum();
        System.out.println("SUM :: " + sum);
    }

    public static void f_6() {
        int sum = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGradeLevel() >= 3)
                .mapToInt(Student::getNoteBooks)
                .sum();
        System.out.println("SUM :: " + sum);
    }

    public static void f_7() {
        int stdList = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGradeLevel() >= 3 && s.getGender().equalsIgnoreCase("female"))
                .mapToInt(Student::getNoteBooks)
                .sum();
        System.out.println(stdList);
    }

    public static void f_8() {
        List<List<Integer>> iList = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9),
                List.of(10, 11, 12)
        );

        List<Integer> lIst=iList.stream().flatMap(List::stream)
                .toList();
        OptionalInt max=lIst.stream().mapToInt(Integer::intValue).max();
        System.out.println(max.getAsInt());
    }

    public static void maxNoteBooks() {
       Optional<Student> std= StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1,s2)-> s1.getNoteBooks()>s2.getNoteBooks()?s1:s2);
        System.out.println(std.get());
    }


}
