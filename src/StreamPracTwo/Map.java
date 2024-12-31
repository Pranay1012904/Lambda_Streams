package StreamPracTwo;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class Map {

    public static void main(String[] rags){
        getNames();
        usefMap();
        customSort();
    }

    public static void getNames(){
       List<String> names = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName).toList();
       System.out.print("\nNAMES:-\n\n"+names);
    }
    //flatmap
    public static void usefMap(){
      List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)//Stream<List<Strings>>
                .flatMap(List::stream)
              .distinct().sorted()
                .toList();
      System.out.print("\nACTIVITIES::"+studentActivities);
    }
    //customized sort
    public static void customSort(){
     List<Student> customSort = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
        System.out.print("\nSORTED OBJECTS:-\n\n");
     customSort.forEach(System.out::println);
    }
}
