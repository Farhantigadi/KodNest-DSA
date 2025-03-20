package patterns;

public class pattern9 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < 5){
                    System.out.print(" ");
                } else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            }
        }
    }
/*
_ _ _ _ _ * * * * *
_ _ _ _ _ * * * * *
_ _ _ _ _ * * * * *
_ _ _ _ _ * * * * *
_ _ _ _ _ * * * * *
 */
