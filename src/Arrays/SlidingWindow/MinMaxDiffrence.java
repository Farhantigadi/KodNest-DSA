package Arrays.SlidingWindow;

public class MinMaxDiffrence {
    public static void main(String[] args) {
        int arr [] = {2,4,1,8,6,7,3};

        int target = 4;
        minDifference(arr,target);
        maxDiffernce(arr,target);
    }


    public static void minDifference(int arr[],int target){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i] && arr[i]<target){
                min = arr[i];
            }
        }
        System.out.println(target-min);
    }
    public static void maxDiffernce(int arr[],int target){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i] && arr[i]>target){
                max=arr[i];
            }
        }
        System.out.println(max-target);
    }
}
