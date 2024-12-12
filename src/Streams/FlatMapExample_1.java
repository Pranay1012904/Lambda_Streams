package Streams;

import Data.Student;
import Data.StudentDataBase;

import java.util.List;

public class FlatMapExample_1 {

    public static List<String> getActivityList(){
       List<String> activities= StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream).toList();
       return activities;
   }

    public static void main(String[] args){
         System.out.print("\nALL ACTIVITIES::"+getActivityList());
    }
}
