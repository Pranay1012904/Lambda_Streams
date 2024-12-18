package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;

public class Filter_Example_1 {

    public static void main(String args[]){
          List<Student> femaleStd= filterFemaleStudents();
          femaleStd.forEach(System.out::println);
    }

    public static List<Student> filterFemaleStudents(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .toList();
    }
}
