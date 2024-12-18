package Streams;

import Data.Student;
import Data.StudentDataBase;

//Find student with highest GPA
public class Reduce_2 {

    public static Double highestGPA(){
       return StudentDataBase.getAllStudents().stream()
                .map(Student::getGpa)
                .reduce(0d,(a,b)-> b>a?b:a);
       //WE CAN ALSO INCLUDE MULTI-LINE STATEMENTS IN reduce()
        /*.reduce((a,b)->{
            if(a.getGpa()>b.getGpa()){
              return a;
            }else{
            return b
            }
        });*/
    }

    public static void main(String[] args){
       System.out.print("\nHIGHEST GPA::"+highestGPA());
    }
}
