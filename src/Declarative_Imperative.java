import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Declarative_Imperative {

    public static void main(String[] args) {
        sum();
        distinct();
    }

    static void sum(){
        System.out.println("SUM::"+IntStream.rangeClosed(1,100).sum());
    }

    public static void distinct(){
        int[] arr={23,45,23,67,89,45};
        Integer[] iArr=Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> iList=Arrays.asList(iArr);
        Set<Integer> dist=iList.stream().collect(Collectors.toSet());
        System.out.println(dist);

        iList.stream().map(i->i*2).peek(System.out::println).toList();

    }
}
