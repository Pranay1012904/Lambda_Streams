package Stream_Api_Prac_6.stream;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class MapStream {

    public static void map_1(){
        List<String> names= StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .toList();
        System.out.println("NAME LIST : "+names);
    }

    public static void map_2(){
        List<String> actList=StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        System.out.println(actList);
    }

    public static void map_3(){
        List<Student> sList=StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
        sList.forEach(System.out::println);
    }
}
