package interfaces;

public class UsingRefernce {
    /*
    its just to refer what i am doing
     */

}
/*
you cannot create an instance of an interface. However, you can create a reference variable of an interface type, which can be used to refer to objects of any class that implements the interface. This feature is pivotal for achieving polymorphism, where the implementation details are hidden behind interface references, allowing for flexible code that can work with any new implementation of the interface.
 */
interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving.");
    }
}

 class Transport {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.drive();  // Outputs: Car is driving.
    }
}
