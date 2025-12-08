package Pattrerns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class AllPatterns{

}
class prac{
    public static void main(String[] args) {
//reverseArray();
//max();
        moveZeroes();
    }
    public static void reverseArray(){
        int arr [] = {8,4,5,6,4};
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }
    public static void max(){
        int arr [] = {10,1,5,10,4};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max2=max;
                max =  arr[i];
            } else if (arr[i]>max2 && arr[i]!=max) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
    public static void moveZeroes(){
        int arr [] = {0,1,0,2,0};
        Set num = new HashSet();
        List list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (num.contains(arr[i])){
             list.add(arr[i]);
            } else{
                num.add(arr[i]);
            }
        }
        System.out.println(num);
        System.out.println(list);
    }

}
class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSoFar=arr[0], curr=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.max(arr[i], curr+arr[i]);
            maxSoFar=Math.max(maxSoFar,curr);
        }
        System.out.println("Max Subarray Sum: "+maxSoFar);
    }
}
