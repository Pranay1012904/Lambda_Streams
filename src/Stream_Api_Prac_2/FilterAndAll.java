package Stream_Api_Prac_2;

import Data.Student;
import Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterAndAll {

    public static void main(String[] args) {
        //femaleStd();
        //reduce();
        //sumFGpa();
        //highestGPA();
        //totalNoteBooks();
        //totalNoteBooksReduce();
        //gradeLevel3();
        //femaleNoteBooks();
        maxNoteBooks();
    }

    static void femaleStd(){
      var list=  StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGender().equalsIgnoreCase("female"))
                .toList();
      list.forEach(System.out::println);
    }

    static void reduce(){
        List<Integer> list=List.of(1,2,3,4,5,6,7);
        int sum=list.stream()
                .reduce(0,Integer::sum);
        System.out.println(sum);
    }

    static void sumFGpa(){
        Double sum=StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGender().equals("female"))
                .peek(s-> System.out.println(s))
                .map(Student::getGpa)
                .reduce(0d,Double::sum);
        System.out.println(sum);
    }

    static void highestGPA(){
        Optional<Student> std= StudentDataBase.getAllStudents()
                .stream()
                .reduce((s,b)->s.getGpa()>b.getGpa()?s:b);
        System.out.println(std.get());
    }
    static void totalNoteBooks(){
       int sum= StudentDataBase.getAllStudents()
                .stream()
                .mapToInt(Student::getNoteBooks)
                .sum();
        System.out.println(sum);

    }
    
    static void totalNoteBooksReduce(){
       int sum= StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce(0,Integer::sum);
        System.out.println(sum);
    }

    static void gradeLevel3(){
        int sum=StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGradeLevel()>3)
                .mapToInt(Student::getNoteBooks)
                .sum();
        System.out.println(sum);
    }

    static void femaleNoteBooks(){
        int sum= StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGender().equalsIgnoreCase("female") && s.getGradeLevel()>=3)
                .map(Student::getNoteBooks)
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }

    static void maxNoteBooks(){
      Optional<Student> std=  StudentDataBase.getAllStudents()
                .stream()
                        .collect(Collectors.maxBy(Comparator.comparing(Student::getNoteBooks)));
        System.out.println(std.get());
    }
}
