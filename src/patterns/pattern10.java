package patterns;

public class pattern10 {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j <=5 ; j++) {
                System.out.print("_ ");
            }
            for (int k = 0; k <i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
/*
_ _ _ _ _ _
_ _ _ _ _ _ *
_ _ _ _ _ _ * *
_ _ _ _ _ _ * * *
_ _ _ _ _ _ * * * *
_ _ _ _ _ _ * * * * *
 */