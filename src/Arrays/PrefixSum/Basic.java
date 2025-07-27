package Arrays.PrefixSum;

import java.util.Arrays;

public class Basic
{
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 1, 3};
        int result[] = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            result[i] = sum;
        }
        System.out.println(Arrays.toString(result));
    }
}
