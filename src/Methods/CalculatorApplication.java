package Methods;

import java.net.Socket;

public class CalculatorApplication {
    public static void main(String[] args) {
        WelcomeMessage();
        addition(100,200);
        int x =10;
        int y=2;

        System.out.println( "Multiplication result is : "+multiplication(x,y));
        System.out.println("Divison result is : "+division(100,80));
    }
    public static void WelcomeMessage(){
        String message = "Welcome User !";
        System.out.println(message);
    }
    static void addition(int a,int b){
        System.out.println("Performing addition");
        int result = a+ b;
        System.out.println("Addition result is : "+result);
    }
    static int multiplication(int x ,int y){
        System.out.println("Performing multiplication");
        int result = x * y;
        return result;
    }
    static float division(int m,int n){
        System.out.println("Performing division :");
        float result = m/n;
        return result;
    }

}

