package Stream_Api_Prac_3;

import Data.Student;
import Data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class mapStream {

    public static void main(String[] args) {
        //mapNames();
        //flatMapImpl();
        //customOperator();
        //filter();
        //reduce_1();
        //fGpaSum();
        //highestGPA();
        //totalNoteBooks();
        //totsalNoteB_2();
        maxNoteBooks();
    }

    static void mapNames(){
       List<String> names = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
               .peek((v->{
                   System.out.println(v);
               }))
                .toList();
        System.out.println(names);
    }

    static void flatMapImpl(){
      List<String> actList = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
              .distinct()
              .sorted()
                .toList();
        System.out.println(actList);
    }

    static void customOperator(){
       List<Student> sortedStud= StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
       sortedStud.forEach(System.out::println);
    }

    static void filter(){
        List<Student> fList=StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGender().equalsIgnoreCase("female"))
                .toList();
        fList.forEach(System.out::println);
    }
    static void reduce_1(){
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        int p=list.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println(p);
    }

    static void fGpaSum(){
       Double GPASum= StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGender().equalsIgnoreCase("female"))
               .peek((s->{
                   System.out.println(s);
               }))
               .map(Student::getGpa)
               .reduce(0d, Double::sum);
        System.out.println("SUM::"+GPASum);


    }

    public static void highestGPA() {
       Optional<Student> std= StudentDataBase.getAllStudents()
                .stream()
                .reduce((a,b)->a.getGpa()>b.getGpa()?a:b);
        System.out.println(std.get());
    }

    public static void totalNoteBooks() {
       int sum= StudentDataBase.getAllStudents()
                .stream()
                .mapToInt(Student::getNoteBooks)
                .sum();
        System.out.println(sum);
    }

    static void totsalNoteB_2(){
        int sum=StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGradeLevel()>=3 && s.getGender().equalsIgnoreCase("female"))
                .peek((s->{
                    System.out.println(s);
                }))
                .mapToInt(Student::getNoteBooks)
                .sum();
        System.out.println(sum);
    }

    static void maxNoteBooks(){
       Optional<Student> std = StudentDataBase.getAllStudents()
                .stream().max(Comparator.comparing(Student::getNoteBooks));
        System.out.println(std.get());
    }
}
