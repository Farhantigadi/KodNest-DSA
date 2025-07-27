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

class Subarrays {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9};
        printAllSubarrays(arr);
    }

    public static void printAllSubarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StringBuilder subarray = new StringBuilder();
            for (int j = i; j < arr.length; j++) {
                subarray.append(arr[j]).append(" ");
                System.out.println(subarray);


            }
        }
    }
}

