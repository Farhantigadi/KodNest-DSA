package OOPS;

public class Fan {
    String color;
    double cost;
    String brand;

    void rotate(){
        System.out.println("Fan is rotating");
    }
    void blow_air(){
        System.out.println("fan blows air");
    }

    public static void main(String[] args) {
        Fan fan1 =new Fan();
        Fan fan2 =new Fan();
        fan1.blow_air();
        fan2.rotate();
        fan1.color="balck";
        fan1.cost=1500.4;
        fan2.brand="phillips";
        fan1.brand="havells";
        fan2.cost=1651;
        System.out.println(fan1.color);
        System.out.println(fan1.cost);
        System.out.println(fan2.brand);
        System.out.println(fan1.brand);
        System.out.println(fan2.cost);
    }
}
