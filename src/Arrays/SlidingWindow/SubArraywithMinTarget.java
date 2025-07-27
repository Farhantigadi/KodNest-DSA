package Arrays.SlidingWindow;

import java.util.Scanner;

class SubArraywithMinTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        int n = sc.nextInt();

        // Declare the array
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the target sum
        int target = sc.nextInt();

        // Function call to find the minimum size subarray sum
        int result = minSubArrayLen(target, arr);

        // Print the result
        System.out.println(result);

        sc.close();  // Close the scanner object
    }

    // Function to find the minimum length subarray sum
    public static int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;

        // Use sliding window technique
        for (int right = 0; right < n; right++) {
            currentSum += arr[right];

            // While the current sum is greater than or equal to the target, try to shrink the window
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= arr[left];  // Subtract the leftmost element from the sum
                left++;  // Move the left pointer to shrink the window
            }
        }

        // If we never found a valid subarray, return 0
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}class minWindowSize{
    public static void main(String[] args) {
        int arr [] = {1,4,7,8,9,6};
        int left =0,right= arr.length;
        int minWindowSize =0;
        int windowSize = right - left+1;
        while (true){
            if (window(arr,left,right) >= 6){
                minWindowSize = windowSize;
                windowSize--;
            }
        }


    }
    public  static  int window(int[] arr,int left,int right){
        int sum =0;
        for (int i = left; i < right; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}