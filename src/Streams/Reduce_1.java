package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Reduce_1 {

    public static Integer reduceSample(){
        List<Integer> product= Arrays.asList(2,4,7,9,23);
        return product.stream()
                .reduce(1,(a,b)->a*b);
        /*AtomicLong gpa=new AtomicLong(0);
        StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .map(student -> gpa+student.getGpa());*/
    }

    public static void main(String[] args){
       System.out.print("\nProduct::"+reduceSample());
    }
}
