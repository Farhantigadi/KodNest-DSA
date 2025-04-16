package Polymorphism;

class Engine {
    String model;
    String horsepower;

    void displayEngineDetails() {
        System.out.println("Engine Model: " + model);
        System.out.println("Engine Horsepower: " + horsepower);
    }
}
class Car {
    Engine carEngine;

    void installEngine(Engine newEngine) {
        carEngine = newEngine;
    }

    void showEngineDetails() {
        carEngine.displayEngineDetails();
    }
}

 class Main {
    public static void main(String[] args) {

        Engine powerfulEngine = new Engine();
        powerfulEngine.model = "V8";
        powerfulEngine.horsepower = "450 HP";

        Car sportsCar = new Car();
        sportsCar.installEngine(powerfulEngine);

        sportsCar.showEngineDetails();
    }
}