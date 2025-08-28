package Optional_Prac;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class OptionalPrac_1 {

    public static void main(String[] args) {
       Optional<Student> std= ofNullable();
       //std.ifPresent(s-> System.out.println(s.getName()));
        //System.out.println(orElse());
        //System.out.println(orElseGet());
        //System.out.println(orElseThrow());
        filter();
    }

    static Optional<Student> ofNullable(){
          Optional<Student> std=Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(std.isPresent())
            return std;
          return Optional.empty();
    }

    static String orElse(){
       Optional<Student> std= Optional.ofNullable(StudentDataBase.studentSupplier.get());
       return std.map(Student::getName).orElse("Default");
    }

    static String orElseGet(){
      Optional<Student> std= Optional.ofNullable(StudentDataBase.studentSupplier.get());
      return std.map(Student::getName).orElseGet(()->"NoStudentFound");
    }

    static String orElseThrow(){
      Optional<Student> std= Optional.ofNullable(null);//StudentDataBase.studentSupplier.get());
      return  std.map(Student::getName).orElseThrow(()-> new RuntimeException("NO STUDENT FOUND"));
    }

    static void filter(){
        Optional.ofNullable(StudentDataBase.studentSupplier.get())
                               .filter(s->s.getGpa()>3.0).ifPresent(System.out::println);
    }
}
