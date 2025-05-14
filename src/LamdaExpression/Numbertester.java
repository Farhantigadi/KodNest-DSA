package LamdaExpression;

interface NumberTester {
        boolean test(int n);
        }

public class Numbertester {
    public static void main(String[] args) {
        NumberTester isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));
    }
}
