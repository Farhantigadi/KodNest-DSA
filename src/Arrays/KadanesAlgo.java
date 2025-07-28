package Arrays;

public class KadanesAlgo {
    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int [] arr) {
        int maxSum = arr[0];
        int currSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
          currSum =  Math.max(arr[i],currSum+arr[i]);
          maxSum= Math.max(currSum,maxSum);

        }
        return maxSum;
    }
}
