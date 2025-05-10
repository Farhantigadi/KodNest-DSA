package AnonymousClass;

interface MathOperation {
    int operate(int a, int b);
}

public class MathOperationS {
    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            public int operate(int a, int b) {
                return a + b;
            }
        };

        int result = addition.operate(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
