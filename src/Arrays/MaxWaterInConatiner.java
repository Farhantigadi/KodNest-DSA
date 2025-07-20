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
}
