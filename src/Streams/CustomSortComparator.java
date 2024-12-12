package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class CustomSortComparator {

    public static List<Student> sortWithComparator(){
        List<Student> sortedStudents = StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
        return sortedStudents;
    }

    public static void main(String[] args){
        System.out.print("\nSORTED STUDENTS:\n");
        sortWithComparator()
                .forEach(System.out::println);


    }
}
