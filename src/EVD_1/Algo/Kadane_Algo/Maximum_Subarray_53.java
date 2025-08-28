package EVD_1.Algo.Kadane_Algo;

public class Maximum_Subarray_53 {

    public static void main(String[] args) {
        System.out.println("MAX::"+maxSubArray());
    }

    public static int maxSubArray() {
        int[] arr = {-2, 1, -3, 4, 1, 2, 1, -5, 4};
        int sum=0;int maxi=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxi=Math.max(maxi,sum);
            if(sum<0)
                sum=0;
        }
        return maxi;
    }
}
