package Arrays.PrefixSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class isAnagram {

    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        int count =0;
        for (int i = 0; i <s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substr = s.substring(i,j);
                if (substr.length()==p.length()){
                    if (isAnagramm(substr,p)){
                        count++;
                         System.out.println(substr);
                    }
                }

            }
        }
        System.out.println(count);

    }
    public static boolean isAnagramm(String str1,String str2){
        char[] a = str1.toCharArray();
        char []b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
