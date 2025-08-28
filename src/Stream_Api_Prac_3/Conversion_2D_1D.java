package Stream_Api_Prac_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Conversion_2D_1D {
    static final int[][] arr={{1,2},{3,4},{5,6}};
    static final List<List<Integer>> ll=List.of(
            Arrays.asList(1,2,3),
            Arrays.asList(4,5,6),
            Arrays.asList(7,8,9),
            Arrays.asList(10,11,12)
    );

    public static void main(String[] args) {
        convert_2d_arr_1d();
        get1dList();
    }

    static void convert_2d_arr_1d(){
        int[] arr1D=Arrays
                .stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println("1D Array:"+Arrays.toString(arr1D));
        get1DList(getintArr(arr1D));
    }

    static Integer[] getintArr(int[] iArr){
        return Arrays.stream(iArr).boxed().toArray(Integer[]::new);
    }

    static void get1DList(Integer[] iArr){
       List<Integer> iList= Arrays.asList(iArr);
        System.out.println("List::"+iList);
    }

    static void get1dList(){
        List<Integer> iList=ll
                .stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(iList);
    }
}
