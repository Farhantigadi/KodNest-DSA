package interfaces;

public class interfaceExteendsinterface {
    /*
    . A Class Implements an Interface, but a Extends An Interfacenother Interface
Explanation:
In Java, a class uses the keyword implements to adhere to the specifications of an interface. This means the class agrees to perform the specific actions the interface defines. On the other hand, an interface can extend another interface using the extends keyword, inheriting its method declarations. This allows for a hierarchy of interfaces, each building on or specializing the behavior defined by its parent.
     */
}
interface Movable {
    void move();
}

interface Flyable extends Movable {
    void fly();
}

class Airplane implements Flyable {
    public void move() {
        System.out.println("Airplane moves forward.");
    }

    public void fly() {
        System.out.println("Airplane flies.");
    }
}

