package interfaces;

public class staticMthd implements A {
    public static void main(String[] args) {
        A.hello();
    }
}
interface A {
    static void hello() {
        System.out.println("this is static method");
    }
}
