package OOPS.Inheritance.type;

public class thisKeyWord {
    public static void main(String[] args) {

Vehicle v = new Vehicle("2025","TATA","black",3000000);

    }
}
class Vehicle {
    int id;
    String model;
    String brand;
    String color;
    int price;
    static int idg = 0;

    Vehicle(int id) {
        this.id = id;
    }


    Vehicle(String model,String brand) {
this(1);
        this.brand = brand;

        this.model = model;


    }
    Vehicle(String color ,int price) {
        this("White","Range Rover");
       this.color = color;
        this.price = price;

    }
    Vehicle (String model,String brand,String color,int price) {
        this(model,brand);
        this.color = color;
        this.price = price;
    }

}

