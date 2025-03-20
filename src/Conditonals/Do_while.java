package Conditonals;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("press 1. Addition");
            System.out.println("press 2. Subtraction");
            System.out.println("press 3. Multiplication");
            System.out.println("press 4. Division");
            System.out.println("press 5. Remainder");
            System.out.println("press 6. Average");
            System.out.println("Enter any other number to Exit");
            System.out.print("Choose an option: ");
            Scanner sc = new Scanner(System.in);
             choice = sc.nextInt();
             if (choice >0 &&  choice < 7) {
                 System.out.println("Enter two numbers");
                 int a = sc.nextInt();
                 int b = sc.nextInt();
                 switch (choice) {
                     case 1 -> System.out.println(a + b);
                     case 2 -> System.out.println(a - b);
                     case 3 -> System.out.println(a * b);
                     case 4 -> System.out.println(a / b);
                     case 5 -> System.out.println(a % b);
                     case 6 -> System.out.println((a + b) / 2);
                     default -> System.out.println("bye bye");
                 }
             } else {
                 System.out.println("Choose correct option");
             }

        }while(choice >= 1 && choice <=6);
    }
}
