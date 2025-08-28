package EVD_1.TwoDArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class SquaresofaSortedArray {

    public static void main(String[] args) {

    }
    //Imperative
    public static void squareAndSort(int[] arr){
       List<Integer> aL= IntStream.of(arr).boxed().toList();
       Collections.sort(aL);
       aL.stream().mapToInt(Integer::intValue).toArray();
    }
    //Declarative
    public static void squareAndSort2(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr[i]*=arr[i];
        }
    }
}
