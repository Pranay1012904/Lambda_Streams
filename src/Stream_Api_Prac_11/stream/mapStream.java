package Stream_Api_Prac_11.stream;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class mapStream {

    public static void main(String[] args) {
        //map_1();
        //flatMap();
        //custSort();
        //filter_1();
        reduce_1();
    }

    public static void map_1() {
        List<String> names = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .toList();
        System.out.println(names);
    }

    public static void flatMap() {
        var activities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(activities);
    }

    public static void custSort(){
       List<Student> std= StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
       std.forEach(System.out::println);
    }

    public static void filter_1(){
       List<Student> fStd= StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGender().equalsIgnoreCase("female"))
                .toList();
       fStd.forEach(System.out::println);
    }

    public static void reduce_1(){
        var list=List.of(2,3,4,5);

       var p= list.stream().reduce((a,b)->a*b);
        System.out.println(p);
    }
}
