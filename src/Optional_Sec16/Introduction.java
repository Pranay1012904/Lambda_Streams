package Optional_Sec16;

import Data.Student;
import Data.StudentDataBase;

import java.util.Optional;

public class Introduction {

    public static void main(String[] args) {
      Optional<String> name= getSupplier();
      if(name.isPresent()){
         //String studentName= name.get();
          System.out.print("\nNAME::"+name.get());
      }else{
          System.out.print("\nNOT FOUND!");
      }
    }

    public static Optional<String> getSupplier(){
         Optional<Student> student= Optional.ofNullable(null);//StudentDataBase.studentSupplier.get());
         if(student.isPresent()){
             //student.get();
             return student.map(Student::getName);
         }
         else
             return Optional.empty();

    }
}
