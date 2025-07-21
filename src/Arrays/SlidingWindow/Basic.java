package Arrays.SlidingWindow;

import java.util.HashMap;

public class Basic {
    public static void main(String[] args) {
        int arr [] = {1,5,8,7,6,9,4,1};
        int k =3;
        int sum = 0;
        int max=0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = sum;

        for (int i=k;i<arr.length;i++){
            sum = sum + arr[i]-arr[i-k];
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
}
