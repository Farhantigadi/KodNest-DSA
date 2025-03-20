package Conditonals;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("Hello Welcome");
        int ans =1;

        Scanner sc= new Scanner(System.in);
       int  a =sc.next().charAt(0);

       while (a == 'y'){
           System.out.println("number is "+ans);
           ans++;
           System.out.println("continue");
            a =sc.next().charAt(0);
       }
    }
}
