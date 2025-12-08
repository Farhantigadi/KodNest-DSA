package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestStringWithoutRC {
    public static void main(String[] args) {
        LongestStringWithoutRC("aabbcba");
    }
    public static void LongestStringWithoutRC(String s){
        Set<Character> set = new HashSet<>();
        int left =0;
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
                    }
        System.out.println(set);

    }
}
class prac55{
    public static void main(String[] args) {
        int sum =0,left=0,maxAvg=0;
       int  k = 3;
        int arr[] = {1,12,5,8,15,6,9,10};
        for (int right = 0; right < k; right++) {
            sum = sum + arr[right];
        }
        maxAvg = Math.max(maxAvg,sum/3);
        for (int i = k; i < arr.length ; i++) {
         sum = sum + arr[i] - arr[i-k];
         maxAvg = Math.max(maxAvg,sum/3);
        }
        System.out.println(maxAvg);

    }
}