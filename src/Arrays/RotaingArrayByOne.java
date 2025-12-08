package Arrays;

public class RotaingArrayByOne {
    public static void main(String[] args) {
        int []arr = {101,102,103,104,105};
//        rotateLeft(arr);
//        rotateNtimes(arr,3);
        rotateNLeftTimes(arr,2);
    }
    public static void rotate(int [] arr){

        int last = arr[arr.length-1];
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        for (int num : arr){
            System.out.println(num);
        }
    }


    public static void rotateLeft(int arr []){
        int first = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]= first;
        for (int num : arr){
            System.out.println(num);
        }
    }
    public static void  rotateNtimes(int [] arr , int k){

            for (int j = 0; j < k ; j++) {
                int last = arr[arr.length-1];
                for (int i = arr.length-1; i >0; i--) {
                    arr[i]=arr[i-1];
            }
                arr[0] = last;
        }
            for (int num : arr){
                System.out.print(num + " ");
            }
    }

    public static void rotateNLeftTimes(int[]arr,int k){
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1] = first;
        }
        for (int num : arr){
            System.out.print(num + " ");
        }

    }
}

