package Arrays;

public class ValidPallindrome2P {
    public static void main(String[] args) {
        String str = "heelo";
        int left =0;
        int right =str.length()-1;
        String s = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        while (left < right) {
            if (s.charAt(left)!=s.charAt(right)){
                System.out.println("Not a Pallindrome");
                return;
            } else {
                left++;
                right--;
            }
        }
        System.out.println("Valid Pallindrome");

    }
}
