
package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {101, 102, 103, 104, 105};
        int arr2[] = {101, 102, 103, 104, 105};
        int arr3[] = {101, 102, 103, 104, 105};
        int newarr[] = new int[arr.length];

        newarr[0] = arr[arr.length - 1];
        int idx = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            newarr[idx++] = arr[i];
        }
        System.out.println(Arrays.toString(arr));


        rotate(arr);
        rotateAnticlockwise(arr2);
        rotateNtimes(arr3, 4);
    }

    public static void rotate(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static int[] rotateAnticlockwise(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        // System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void rotateNtimes(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            rotateAnticlockwise(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
}

