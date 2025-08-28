package Stream_Api_Prac_6.twoDOneD;

public class List1 {
    public static final java.util.List<java.util.List<Integer>> NESTED_LIST = java.util.List.of(
            java.util.List.of(1, 2, 3),
            java.util.List.of(4, 5, 6),
            java.util.List.of(7, 8, 9),
            java.util.List.of(10, 11, 12)
    );

    public static void nested_List() {
        System.out.println("MULTI-DIMENSIONAL LIST");
        System.out.println(NESTED_LIST);
        java.util.List<Integer> s_List = NESTED_LIST.stream().flatMap(java.util.List::stream).toList();
        System.out.println("SINGLE LIST\n" + s_List);
    }
}
