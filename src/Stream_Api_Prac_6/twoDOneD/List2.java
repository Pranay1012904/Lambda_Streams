package Stream_Api_Prac_6.twoDOneD;

import java.util.List;

public class List2 {

    public static final List<List<Integer>> INTEGER_LIST = List.of(
            List.of(1, 2, 3),
            List.of(4, 5, 6),
            List.of(7, 8, 9),
            List.of(10, 11, 12)
    );

    public static void ListOfLists() {
       List<Integer> iList= INTEGER_LIST.stream().flatMap(List::stream).toList();
        System.out.println(iList);
    }
}
