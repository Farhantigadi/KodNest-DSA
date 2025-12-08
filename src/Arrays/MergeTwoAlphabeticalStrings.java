package Arrays;

import javax.xml.stream.events.Characters;
import java.util.*;

public class MergeTwoAlphabeticalStrings {
    public static void main(String[] args) {
        mergedString("acxz","bd");

    }
    public static void mergedString(String str1 , String str2){
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        int i=0,j=0;
        StringBuilder merge = new StringBuilder();
        while (i<ch1.length && j<ch2.length){
            if (ch1[i] < ch2[j]){
                merge.append(ch1[i++]);
            } else {
                merge.append(ch2[j++]);
            }

        }
        while (i<ch1.length){
            merge.append(ch1[i++]);
        }
        while (j<ch2.length) {
            merge.append(ch2[j++]);

        }
        System.out.println(merge);
    }
}
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        int start=0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
            start=left;


        }
        System.out.println(s.substring(start,start+max));
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}

