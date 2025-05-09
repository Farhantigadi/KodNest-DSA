package InnerClass;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public void start() {
            System.out.println("The " + model + " engine with " + horsepower + " HP is starting.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla");
        Car.Engine myEngine = myCar.new Engine(300);
        myEngine.start();
    }
}
