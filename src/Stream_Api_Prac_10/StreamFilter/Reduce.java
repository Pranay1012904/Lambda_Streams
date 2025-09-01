package Stream_Api_Prac_10.StreamFilter;

import Data.Student;
import Data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Reduce {

    public static void main(String[] args) {
        //f_1();
        //f_2();
        //f_3();
        //f_4();
        f_5();
    }

    public static void f_1() {
        Optional<Double> d = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .map(Student::getGpa)
                .reduce(Double::sum);
        System.out.println("SUM OF FEMALE GPA :: " + d.get());
    }

    public static void f_2() {
        int sum = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("TOTAL NOTEBOOKS :: " + sum);
    }

    public static void f_3() {
        Optional<Integer> sum = StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGradeLevel() > 3 && s.getGender().equalsIgnoreCase("female"))
                .map(Student::getNoteBooks)
                .reduce(Integer::sum);
        System.out.println("TOTAL NOTEBOOKS :: " + sum.get());
    }

    public static void f_4() {
        List<Integer> list = List.of(56, 90, 21, 89, 34);

        int max = list.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("MAX :: " + max);

        OptionalInt max2 = list.stream().mapToInt(Integer::intValue).max();
        System.out.println("MAX-2 :: " + max2.getAsInt());
    }

    public static void f_5() {
        Optional<Student> std = StudentDataBase.getAllStudents()
                .stream()
                .reduce((a, b) -> a.getNoteBooks() > b.getNoteBooks() ? a : b);
        System.out.println(std.get());
    }
}
