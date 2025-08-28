package EVD_1.Algo.Kadane_Algo;

public class Maximum_SubArray_Kadane2 {

    public static void main(String[] args) {
        System.out.println(max());
    }

    public static int max() {
        int[] arr = {-2, 1, -3, 4, 1, 2, 1, -5, 4};
        int sum = 0; int maxi=0;
        for(int i: arr){
            System.out.println(i);
            sum+=i;
            maxi=Math.max(sum,maxi);
            if(sum<0)
                sum=0;
        }

        return sum;
    }
}
