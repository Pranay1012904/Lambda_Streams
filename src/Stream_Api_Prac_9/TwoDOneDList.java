package Stream_Api_Prac_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TwoDOneDList {

    public static void SToArrayList() {
        String s = "PRANAY";
        List<String> sL = Arrays.asList(s.split(""));
        System.out.println("LIST::" + sL);
    }

    public static void IntPlay() {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> iL = IntStream.of(arr).boxed().toList();
        System.out.println("LIST::" + iL);
        int[] arr2 = iL.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("ARRAY::" + Arrays.toString(arr2));
        int[] arr3 = Arrays.copyOfRange(arr2, 0, arr2.length);
        System.out.println("COPY OF RANGE::"+arr3);
    }

    public static void charPlay(){
        char c='A';
        System.out.println("NUM::"+Integer.parseInt("A"));
        int y=10;

    }


}
