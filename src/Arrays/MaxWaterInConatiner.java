package Arrays;

public class MaxWaterInConatiner {
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
              int min =  Math.min(arr[i],arr[j]);
                int temp = (min)*(i-j);
                max = Math.max(temp,max);
            }
        }
        System.out.println(max);
    }
}class Prac {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 9, 6, 4};
        int k = 3;
        System.out.println(maxAvgTemp(arr, k));
    }

    public static double maxAvgTemp(int[] arr, int k) {
        int sum = 0;
        double maxAvg = Double.MIN_VALUE;

         for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / k;
        maxAvg = avg;

         for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            avg = (double) sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }

        return maxAvg;
    }
}
