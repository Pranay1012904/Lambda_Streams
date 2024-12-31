package StreamPracTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Peak {

    public static void main(String[] args){
        List<Integer> myList= Arrays.asList(2,3,4,5,6);

        myList.stream().map(i->i*2)
                .peek((v->{
                    System.out.print("\nNUM::"+v);
                })).toList();
    }
}
