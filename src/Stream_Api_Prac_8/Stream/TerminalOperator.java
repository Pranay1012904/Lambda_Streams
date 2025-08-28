package Stream_Api_Prac_8.Stream;

import Data.Student;
import Data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperator {

    public static void main(String[] args) {
        //p1();
        //p2();
        //p3();
        p4();
    }

    public static void p1() {
        String op = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
        System.out.println("OUTPUT :: " + op);
    }

    public static void p2() {
        String s = "PRANAY";
        List<String> sA = Arrays.asList(s.split(""));
        System.out.println("STRING LIST :: " + sA);
        String op = sA.stream()
                .collect(Collectors.joining("-", "(", ")"));
        System.out.println("OUTPUT :: " + op);
    }

    public static void p3() {
        Long ss = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.counting());
        System.out.println("TOTAL :: " + ss);
    }

    public static void p4() {
        Double d = (double) StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getGpa)
                .filter(gpa -> gpa > 3.9)
                .count();
        System.out.println("TOTAL :: " + d);
    }
}
