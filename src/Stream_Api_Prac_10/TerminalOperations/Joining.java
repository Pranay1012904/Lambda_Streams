package Stream_Api_Prac_10.TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        //join_1();
        //join_2();
        join_3();
    }

    public static void join_1() {
        String names = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
        System.out.println("NAMES::" + names);
    }

    public static void join_2() {
        var names = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(" - "));
        System.out.println("NAMES::"+names);
    }

    public static void join_3() {
        var names=StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(" - ","(",")"));
        System.out.println("NAMES::"+names);
    }
}
