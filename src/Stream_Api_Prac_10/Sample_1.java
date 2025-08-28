package Stream_Api_Prac_10;

import java.util.List;
import java.util.stream.IntStream;

public class Sample_1 {

    public static void main(String[] args) {
        int sum= IntStream.rangeClosed(1,10).sum();
        System.out.println("SUM::"+sum);
        //unique();
        peek();
    }

    public static void unique(){
        var list= List.of(12,1,45,12,45);
        System.out.println(list.stream().distinct().toList());
    }

    public static void peek(){
        var list= List.of(12,1,45,12,45);
        list.stream().peek(i->{
            System.out.println(i);
        }).toList();
    }
}
