package Stream_Api_Prac_6.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ImpDec {
    static final int[][] TWO_DIM = {
            {1, 2, 3},
            {2, 5, 8},
            {3, 5, 6},
            {16, 6, 3}
    };

    public static void main(String[] args) {
            ImpDec impDec=new ImpDec();
            //impDec.sum();
            //impDec.unique();
        //MapStream.map_1();
        //MapStream.map_3();
        //FilterStream.f_1();
        //FilterStream.f_3();
        //FilterStream.f_8();
        FilterStream.maxNoteBooks();
    }

    public void sum(){
       int sum= IntStream.rangeClosed(1,10).sum();
        System.out.println("SUM:"+sum);
    }

    public void unique(){
       int[] arr=Arrays.stream(TWO_DIM).flatMapToInt(Arrays::stream).toArray();
        System.out.println("ARR: "+arr);
        List<Integer> iList= Arrays.stream(arr).distinct().boxed().toList();
        System.out.println("LIST: "+iList);
    }
}
