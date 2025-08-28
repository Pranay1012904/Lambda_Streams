package Numeric_Stream_Prac;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream_4 {

    public static void main(String[] args) {
        //sample_1();
        //sample_2();
        //LongStream();
        //asDoubleStream();
       // boxing();
        //unBoxing();
        //unboxing2();
        //maptopObj();
        maptoLong();
    }

    static void sample_1(){
        List<Integer> l= Arrays.asList(1,2,3,4,5,6);
        int sum=l.stream().reduce(0,Integer::sum);
        System.out.println("Sample_1 Sum:"+sum);
        Optional<Integer> op=l.stream().findFirst();
    }

    static void sample_2(){
        System.out.println(IntStream.rangeClosed(1,6).sum());
    }

    static void LongStream(){
        System.out.println(LongStream.rangeClosed(1,6).sum());
    }

    static void asDoubleStream(){
        System.out.println(IntStream.rangeClosed(1,6).asDoubleStream().sum());
    }

    static void boxing(){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Integer[] iArr=Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> iList=Arrays.asList(iArr);
        System.out.println(iList);
    }

    static void unBoxing(){
        List<List<Integer>> lst=List.of(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10,11,12)
        );
        int[] arr=lst.stream()
                .flatMap(List::stream)
                .mapToInt(a->a)
                .toArray();
        System.out.println(Arrays.toString(arr));
    }

    static void unboxing2(){
        int[][] arr={{1,2},{3,4},{5,6}};
        int[] sArr=Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(sArr));
    }
    static void maptopObj(){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        List<Integer> iList=Arrays.stream(arr).
                mapToObj((i)-> Integer.valueOf(i))
                .toList();
        System.out.println(iList);
    }

    static void maptoLong(){
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        long[] lArr=Arrays.stream(arr)
                .mapToLong(i->i)
                .toArray();
        System.out.println(Arrays.toString(lArr));
    }
}
