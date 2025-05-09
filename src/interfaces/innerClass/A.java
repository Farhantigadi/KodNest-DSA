package interfaces.innerClass;

//Only default methods can have body in the interface
class B {
    interface InnerInterface{
        boolean isOdd(int a);
    }

}
public class A implements B.InnerInterface {

    @Override
    public boolean isOdd(int a) {
        return (a & 1)==1;
    }
}
