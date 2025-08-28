package EVD_1.TwoDArray;

/*Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.
For example, flipping [1,1,0] horizontally results in [0,1,1]. To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].

Input 1: image = [[1,1,0],[1,0,1],[0,0,0]]
Output 1: [[1,0,0],[0,1,0],[1,1,1]]
Explanation 1: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]]. Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlippingAnImage_2D {

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        //flip(arr);
        flipList();
    }

    public static void flip(int[][] arr) {
        int[][] temp = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            int col = 0;
            for (int j = arr[0].length - 1; j >= 0; j--) {
                if (arr[i][j] == 1) {
                    temp[i][col] = 0;
                } else {
                    temp[i][col] = 1;
                }
                col++;
            }
        }
        int[] a = Arrays.stream(temp).flatMapToInt(Arrays::stream).toArray();
        System.out.println(Arrays.toString(a));
    }

    /// //////////////////////////////////////////////////////////////////////
    //List
    public static void flipList() {
        List<List<Integer>> input = new ArrayList<>();
        List<List<Integer>> nL = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(0);
        List<Integer> b = new ArrayList<>();
        b.add(0);
        b.add(0);
        input.add(a);
        input.add(b);


        int index = 0;
        while (index < input.size()) {
            //Collections.reverse(iL.get(index));
            List<Integer> temp=input.get(index);
            Collections.reverse(temp);
            for(int i=0;i<temp.size();i++){
                if(temp.get(i)==1){temp.set(i,0);}
                else if(temp.get(i)==0){temp.set(i,1);}
                else{
                    temp.remove(i);
                }
            }
            input.set(index,temp);
            index++;
        }
        //System.out.println(nL);
       // return input;
    }
}
