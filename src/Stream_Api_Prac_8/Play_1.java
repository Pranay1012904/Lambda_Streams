package Stream_Api_Prac_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Play_1 {

    public static void main(String[] args) {
        //stringPlay();
        intToInteger();
    }

    public static void stringPlay() {
        String s = "Pranay";
        List<String> sL = Arrays.asList(s.split(""));
        System.out.println("String To List :: " + sL);
        Optional<String> bToS = sL.stream()
                .reduce(String::concat);
        String ss = bToS.get();
    }

    public static void intToInteger() {
        int a = 10;
        String s = Integer.toBinaryString(a);
        System.out.println(s);
        int b = Integer.parseInt(s);
        System.out.println(b);
    }
}
