package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Reduce_1 {

    public static Double reduceSample(){
        List<Integer> product= Arrays.asList(2,4,7,9,23);
         product.stream()
                .reduce(1,(a,b)->a*b);

       Double sumOfFemaleGPA= StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .map(Student::getGpa)
                .reduce(0d,(a,b)-> a+b);
    //Add return statements accordingly
        return sumOfFemaleGPA;
    }

    public static void main(String[] args){
       //System.out.print("\nProduct::"+reduceSample());
        System.out.print("\nSum Of Female Gpa::"+reduceSample());
    }
}
