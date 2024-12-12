package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;

public class MapExample_1 {

    public static void main(String[] args){
            System.out.print("\nNames List:"+getNamesList());
    }

    public static List<String> getNamesList(){
       List<String> stdNames= StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getName) //Stream<String>
               .map(String::toUpperCase)
               .toList();
        return stdNames;
    }
}
