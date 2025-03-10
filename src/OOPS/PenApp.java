package OOPS;

import java.util.Scanner;

public class PenApp {
    String brand;
    String inkColor;
    int cost;
    void write(){
        System.out.println(this.brand+" brand pen with " + this.inkColor+" colour and cost is Rs"+cost+" is used.");
    }

    public static void main(String[] args) {
        PenApp pen =new PenApp();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Pen brand");
        pen.brand=sc.nextLine();


        System.out.println("Enter ink Color");
        pen.inkColor=sc.next();



        System.out.println("Enter cost of the pen ");
        pen.cost=sc.nextInt();


        pen.write();

    }
}
