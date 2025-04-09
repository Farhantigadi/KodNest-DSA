package OOPS.Inheritance.type;

public class Eagle extends Bird{
    @Override
    void fly() {
        super.fly();
    }
    void eat() {
        System.out.println(this.name+" will eat");
    }
}
