package Polymorphism;
class Appliance {
    public void turnOn() {
        System.out.println("Generic appliance is turned on.");
    }
}
class Blender extends Appliance {
    public void turnOn() {
        System.out.println("Blender is set to mix.");
    }
}

class Microwave extends Appliance {
    public void turnOn() {
        System.out.println("Microwave is ready to heat.");
    }
}

 class Main {
    public static void main(String[] args) {
        Appliance myBlender = new Blender(); // Upcasting
        Appliance myMicrowave = new Microwave(); // Upcasting
        myBlender.turnOn();
        myMicrowave.turnOn();
    }
}

