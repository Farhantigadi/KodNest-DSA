package Conditonals;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class CalculatorApp {
    // Method to add two numbers and print result
    public static void add(int num1, int num2) {
        System.out.println("Addition " + num1 + " + " + num2 + " = " + (num1 + num2));
    }
    // Method to subtract two numbers and print result
    public static void sub(int num1, int num2) {
        System.out.println("Subtraction" + num1 + " - " + num2 + " = " + (num1 - num2));
    }
    // Method to multiply two numbers and print result
    public static void mul(int num1, int num2) {
        System.out.println("Multiplication " + num1 + " * " + num2 + " = " + (num1 * num2));
    }
    // Method to divide two numbers and print result
    public static void div(int num1, int num2) {

        System.out.println("Division " + num1 + " / " + num2 + " = " + ((double) num1 / num2));
    }
    public static void main(String[] args) throws FileNotFoundException {
        // Change this path as needed
        File file = new File("C:\\Users\\mohammad\\Downloads\\input.txt");
        Scanner scanner = new Scanner(file);

        // Reading two numbers from the file
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Performing calculations
        add(num1, num2);
        sub(num1, num2);
        mul(num1, num2);
        div(num1, num2);

        // Close the scanner
        scanner.close();
    }
}
