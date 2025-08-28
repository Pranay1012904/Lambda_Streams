package EVD_1.TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDiagonalSum {

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        // Adding rows directly with elements
        matrix.add(Arrays.asList(1, 20, 30));
        matrix.add(Arrays.asList(40, 5, 60));
        matrix.add(Arrays.asList(70, 50, 9));
        int size = matrix.get(0).size();
        int index = 0;
        int sum = 0;
        for (List<Integer> l : matrix) {
            sum += l.get(index);
            index++;
        }
        //System.out.println(sum);
        try {
            System.out.println(Integer.parseInt("box"));
        }catch(Exception e){
            //do nothing
        }
    }
}
