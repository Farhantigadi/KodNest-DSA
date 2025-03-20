package patterns;

public class pattern14 {
    public static void main(String[] args) {
        for (int i = 0; i <=3; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("_ ");
            }
            for (int k = 1; k <3 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*

_ _ _ _ _ _ * * * * *
_ _ _ _ _ * * * *
_ _ _ _ * * *
_ _ _ * *
_ _ *
_
 */