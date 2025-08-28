package EVD_1.Algo.Kadane_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-2, 10, -3, 4, 6, 2, 1, -5, 41};
        Arrays.sort(arr);
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        System.out.println(binarySearch(arr, k, 0, arr.length - 1));

    }

    public static int binarySearch(int[] arr, int k, int l, int r) {
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == k) {
                return 0;
            } else if (arr[mid] < k) {
                l = mid + 1;
                binarySearch(arr, k, l, r);
            } else if (arr[mid] > k) {
                r = mid - 1;
                binarySearch(arr, k, l, r);
            }
        }
        return -1;
    }
}
