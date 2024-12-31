package Streams;

import Data.Student;
import Data.StudentDataBase;

public class Reduce_3 {
    //get total notebooks

    public static void main(String[] args){
        getTotalNoteBooks();
    }

    public static void getTotalNoteBooks(){
        int total=StudentDataBase.getAllStudents().stream()
                .map(Student::getNoteBooks).reduce(0, Integer::sum);
    System.out.print("\nTOTAL::"+total);
    }
}
