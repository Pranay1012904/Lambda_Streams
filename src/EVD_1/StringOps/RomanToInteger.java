package EVD_1.StringOps;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        deduce("XIV");
    }

    public static void deduce(String s) {

        int sum = 0;
        int p = 0;
        Map<Character, Integer> hm = createHM();
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = hm.get(s.charAt(i));
            if (i != 0)
                p = hm.get(s.charAt(i - 1));
            if (p < c && i != 0) {
                sum = sum + (c - p);
                i--;
            } else {
                sum += c;
            }

        }
        System.out.println(sum);
    }

    public static Map<Character, Integer> createHM() {
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
        Map<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);
        return dictionary;
    }
}
