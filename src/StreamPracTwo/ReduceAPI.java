package StreamPracTwo;

import Data.Student;
import Data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceAPI {

    public static void main(String[] args){
        List<Integer> iList= new ArrayList<>();
       iList.add(5);
        //System.out.print(iList.indexOf(3));
        myReduce(iList);
        fGPASum();
        hGPA();
    }
    //reduce
    public static void myReduce(List<Integer> myList){
      int product=myList.stream()
              .reduce(1,(a,b)->a*b);
        System.out.print("\n\nPRODUCT::"+product);
    }
    //Sum of female Student GPA
    public static void fGPASum(){
       double sGPA= StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .map(Student::getGpa)
                .reduce(0d, Double::sum);
        System.out.print("\nSTUDENT GPA SUM : "+sGPA);
    }

    public static void hGPA(){
       Double hGPA = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getGpa)
                .reduce(Double.MIN_VALUE,(a,b)->b>a?b:a);
        System.out.print("\nHIGHEST GPA::"+hGPA);
       // int arr[]=new Int();

    }
}
