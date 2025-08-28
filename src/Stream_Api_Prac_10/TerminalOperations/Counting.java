package Stream_Api_Prac_10.TerminalOperations;

import Data.Student;
import Data.StudentDataBase;

import java.util.stream.Collectors;

public class Counting {

    public static void main(String[] args) {
       // count();
        count_2();
    }

    public static void count() {
        var total = StudentDataBase.getAllStudents()
                .stream()
                .count();
        System.out.println("TOTAL::"+total);
    }

    public static void count_2() {
        var total=StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getGpa)
                .filter(g->g>3.5)
                .count();
        System.out.println("TOTAL::"+total);
    }
}
