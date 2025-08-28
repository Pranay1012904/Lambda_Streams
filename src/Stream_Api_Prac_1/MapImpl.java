package Stream_Api_Prac_1;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class MapImpl {

    public static void main(String[] args) {
        //getNames();
        //flatmapImpl();
        sortNames();
    }

    static void getNames(){
       var list= StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName).toList();
        list.forEach(System.out::println);
    }

    static void flatmapImpl(){
       var list= StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
               .sorted(Comparator.reverseOrder())
                .toList();
       list.forEach(System.out::println);
    }

    static void sortNames(){
       var students= StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
       students.forEach(System.out::println);
    }

}
