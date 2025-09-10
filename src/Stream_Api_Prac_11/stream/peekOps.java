package Stream_Api_Prac_11.stream;

import java.util.List;

public class peekOps {

    public static void main(String[] args) {
        var list = List.of(23, 45, 12, 23, 78, 99, 45, 0);
        list.stream().peek((v->{
            System.out.println("VAL::"+v);
        })).toArray();
    }
}
