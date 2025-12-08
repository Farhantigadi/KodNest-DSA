package Arrays;
import java.util.*;

public class LongestPallindromicSubarray {
    public static void main(String[] args) {
        String str = "abcbba";
        String max = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String substring = str.substring(i,j);
                if (isPallindrome(substring)){
                   if (substring.length()>max.length()){
                       max = substring;
                   }
                }
            }
        }
        System.out.println(max);
    }
    public static  boolean isPallindrome(String str){
        String copy = "";
        for (int i = str.length()-1; i >=0; i--) {
            copy += str.charAt(i);
        }
        if (copy.equals(str)){
            return true;
        }
        return false;
    }
}
class LongestPalindromicSubarray {
    public static void main(String[] args) {
        String str = "ababbba";
        String max = "";

        for (int i = 0; i < str.length(); i++) {
            // Odd length palindrome
            String odd = expandAroundCenter(str, i, i);
            if (odd.length() > max.length()) {
                max = odd;
            }

            // Even length palindrome
            String even = expandAroundCenter(str, i, i + 1);
            if (even.length() > max.length()) {
                max = even;
            }
        }

        System.out.println(max); // Output: "bcb"
    }

    // Expand around center and return palindrome
    public static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // substring (left+1, right) is the valid palindrome
        return s.substring(left + 1, right);
    }
}

class f{
    public static void main(String[] args) {
        largestPall("bcbbccbb");
    }
    public static void largestPall(String str){
        String max = "";
        for (int i = 0; i < str.length(); i++) {

            String odd = expandArountCenter(str,i,i);
            if (odd.length() > max.length()){
                max = odd;
            }
            String even = expandArountCenter(str,i,i+1);
            if (even.length() > max.length()){
                max = even;
            }
        }
        System.out.println(max);
    }
    public static  String expandArountCenter(String str,int i,int j){
        while (i>=0 && j<str.length() && str.charAt(i)==str.charAt(j)){
            i--;
            j++;
        }
        return str.substring(i+1,j);
    }
}
class prac2 {
    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4};
        optimisemaxWater(arr);
    }

    public static void Findmaxwater(int arr[]) {
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        int maxWater = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == maxIdx) {
                continue;
            } else {
                int min = Math.min(max, arr[i]);
                int diffIdx = maxIdx - i;
                if (diffIdx < 0) {
                    diffIdx = diffIdx * -1;
                }
                maxWater = Math.max(maxWater, min * diffIdx);
            }

        }
        System.out.println(maxWater);

    }

    public static void optimisemaxWater(int arr[]) {
        int left = 0, right = arr.length - 1;
        int maxWater = 0;
        while (left < right) {
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);
            maxWater = Math.max(maxWater, width * height);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxWater);
    }
}
