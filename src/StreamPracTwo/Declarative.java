package StreamPracTwo;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Declarative {
     static final Logger logger= Logger.getLogger(Declarative.class.getName());

    public static void main(String[] args){
       dec();
       unique();
    }

    public static void dec(){
        int sum=IntStream.rangeClosed(0,100).sum();
        logger.info(String.format("SUM IS :: %d",sum));
    }

    public static void unique(){
        List<Integer> aList= Arrays.asList(1,2,34,23,56,78,12,12,34,56);
        System.out.print(aList.stream().distinct().toList());
    }
}
