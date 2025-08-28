package groupingBy;

import Data.Student;
import Data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingBy_Prac {

    public static void main(String[] args) {
       // groupingBy_1();
       // groupingBy_2();
       // groupingBy_3();
        geoupingBy_4();
    }

    static void groupingBy_1(){
       Map<String, List<Student>> stdMap=StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
       stdMap.forEach((k,v)->
               System.out.println("KEY->"+k+"\tVALUE->"+v));
    }

    static void groupingBy_2(){
       Map<EnumerationImpl.score, List<Student>> result= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(s->s.getGpa()>=4.0?EnumerationImpl.score.OUTSTANDING:EnumerationImpl.score.AVERAGE));
        result.forEach((k,v)->
                System.out.println("KEY->"+k+"\tVALUE->"+v));
    }

    static void groupingBy_3(){
       Map<Integer,Map<EnumerationImpl.score,List<Student>>> op= StudentDataBase.getAllStudents()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getGradeLevel,
                        Collectors.groupingBy((s)->s.getGpa()>=4.0?EnumerationImpl.score.OUTSTANDING:EnumerationImpl.score.AVERAGE)
                ));
        System.out.println(op);
    }

    static void geoupingBy_4(){
       LinkedHashMap<String, Set<Student>> op= StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender, LinkedHashMap::new,Collectors.toSet()));
       op.forEach((k,v)->
               System.out.println("KEY->"+k+"\nVALUE->"+v));
    }
}
