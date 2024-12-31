package StreamPracTwo;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;

public class FilterApi {

    public static void main(String[] args){
        myFilter();
    }

    public static void myFilter(){
       List<Student> fList = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .toList();
       System.out.print("\nFEMALE STUDENT LIST::\n");
       fList.forEach(System.out::println);
    }
}
