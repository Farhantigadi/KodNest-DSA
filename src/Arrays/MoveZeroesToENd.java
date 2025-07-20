package Arrays;

import java.util.Arrays;

public class MoveZeroesToENd {
    public static void main(String[] args) {
        int arr [] = {0,0,14,0,7,1};

        moveZeo(arr);
    }
    public static void moveZeo(int []arr){
        int i=0;
        int j= arr.length-1;

        while (i<j){
            if (arr[i]==0){
                if (arr[j]==0){
                    j--;
                } else {
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    i++;
                }
            } else {
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
