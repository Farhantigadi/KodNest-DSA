package Conditonals;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a>90){
            System.out.println("Your Grade is A");
        } else if (a<80 && a>70) {
            System.out.println("Your Grade is B");
        }else if(a<70 && a>60){
            System.out.println("Your Grade is C");
        }
        else {
            System.out.println("Your Grade is D");
        }

    }
}
