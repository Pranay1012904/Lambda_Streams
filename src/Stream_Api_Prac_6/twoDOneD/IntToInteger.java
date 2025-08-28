package Stream_Api_Prac_6.twoDOneD;

import java.util.List;
import java.util.stream.IntStream;

public class IntToInteger {

    public static void arrToList() {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> iList=IntStream.of(arr).boxed().toList();
        System.out.println("LIST : "+iList);
    }
}
