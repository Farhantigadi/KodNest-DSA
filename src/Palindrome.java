public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(123321);
        isPalindrome(12345);
    }

    public static void isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }

        if (reversed == original) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}

