package Stream_Api_Prac_6.twoDOneD;

import java.util.List;

public class List3 {

    public static final List<List<Integer>> iList = List.of(
            List.of(21,32,29,89),
            List.of(9,5,8),
            List.of(100,99,145)
    );

    public static void LLToL(){
       List<Integer> sList= iList.stream().flatMap(List::stream).toList();
        System.out.println("SL :: "+sList);
    }
}
