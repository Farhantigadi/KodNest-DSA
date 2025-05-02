package interfaces;

public class MultipleInheritance {

}
/*
Interfaces Can Be Used to Achieve Multiple Inheritance in Java
Explanation:
Java does not support multiple inheritance through classes to avoid the "diamond problem," where a class inherits from two classes that have conflicting implementations of the same method. However, Java allows a class to implement multiple interfaces, thereby enabling a form of multiple inheritance. Since interfaces only declare methods without defining them, this approach avoids ambiguity and conflict.
 */
interface Drawable {
    void draw();
}

interface Collapsible {
    void collapse();
}

class GraphicObject implements Drawable, Collapsible {
    public void draw() {
        System.out.println("Drawing object.");
    }

    public void collapse() {
        System.out.println("Collapsing object.");
    }
}
