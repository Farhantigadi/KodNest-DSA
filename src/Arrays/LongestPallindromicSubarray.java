package Arrays;

public class LongestPallindromicSubarray {
    public static void main(String[] args) {
        String str = "abcba";
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
