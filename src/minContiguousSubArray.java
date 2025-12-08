import java.util.*;

public class minContiguousSubArray {
    public static void main(String[] args) {
        int arr [] = {1,4,4,2,1};
        minSubArray(arr,3);
    }
    public static void minSubArray(int arr [],int target){
        int minLength = Integer.MAX_VALUE;

        int left =0,sum=0;
        for (int right = 0; right <arr.length ; right++) {
        sum = sum + arr[right];

        while (sum>=target){
            minLength = Math.min(minLength,right-left+1);
            sum = sum - arr[left];
            left++;
        }
        }
        System.out.println(minLength);
    }




    public static List<Integer> findKClosest(int[] arr, int target, int k) {
        int left = 0;
        int right = arr.length - 1;

        // Shrink window until size == k
        while (right - left + 1 > k) {
            if (target - arr[left] > arr[right] - target) {
                left++;   // left side is farther
            } else {
                right--;  // right side is farther
            }
        }

        // Collect result in sorted order
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}
