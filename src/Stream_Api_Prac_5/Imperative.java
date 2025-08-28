package Stream_Api_Prac_5;

import java.util.List;
import java.util.stream.IntStream;

public class Imperative {

    public static void main(String[] args) {
        imp_2();
    }

    public static void imp_1(){
       int sum= IntStream.rangeClosed(1,10).sum();
        System.out.println(sum);
    }

    public static void imp_2(){
        var list= List.of(1,1,2,3,3,5,6,6);
        var dist=list.stream().distinct().toList();
        System.out.println(dist);
    }
}
