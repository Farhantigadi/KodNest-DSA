package patterns;

public class pattern13 {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            for (int j = i; j <=5 ; j++) {
                System.out.print("_ ");
            }
            for (int k = i; k <5 ; k++) {
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