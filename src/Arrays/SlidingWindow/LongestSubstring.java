package Arrays.SlidingWindow;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        String str  = "abcdabcdea";
        lengthOfLongestSubstring(str);
//        findRepeating(str);
    }

    public static void lengthOfLongestSubstring(String str) {
        int left =0;
        int max =0;
        int start =0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            max = Math.max(max,right-left+1);
            start = left;


        }
        String s = str.substring(start,start+max);
        System.out.println(s);
        System.out.println(max);
    }

    public static void   findRepeating(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        System.out.println(map);
    }
}

