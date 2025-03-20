package Conditonals;

import java.util.Scanner;

import static Conditonals.GCD_task.gcd;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println( gcd(a,b));
    }
}
