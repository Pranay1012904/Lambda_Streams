package TerminalOperations_Prac;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Collect {

    public static void main(String[] args) {
        // collect();
        // collectorsJoining();
        //countImpl();
        maxByMinBy();
    }

    static void collect() {
        List<Student> stdList = StudentDataBase.getAllStudents()
                .stream().toList();//.collect(Collectors.toUnmodifiableList());
        stdList.forEach(i -> System.out.println(i));
    }

    static void collectorsJoining() {
        var names = StudentDataBase.getAllStudents()
                .stream().map(Student::getName).collect(toList());
        System.out.println(names);
    }

    static void countImpl() {
        Long count = StudentDataBase.getAllStudents()
                .stream().filter(s -> s.getGpa() > 3.5)
                .collect(counting());
        System.out.println(count);
    }

    static void mappingImpl() {
        StudentDataBase.getAllStudents()
                .stream();
               // .collect(mapping((s)-> s.getClass()), toList());

    }

    static void maxByMinBy(){
        Optional<Student> max=StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
        System.out.println(max.get());

        Optional<Student> std=StudentDataBase.getAllStudents().stream().max(Comparator.comparing(Student::getGpa));
        System.out.println(std);
    }
    static void suming(){
        int sum=StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
        System.out.println();
    }
}


