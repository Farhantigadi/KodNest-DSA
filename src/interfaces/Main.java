package interfaces;

interface SmartDevice {
    void turnOn();
    void turnOff();
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart light turns on with adjustable brightness");
    }

    public void turnOff() {
        System.out.println("Smart light turns off");
    }
}

class SmartSecurity implements SmartDevice {
    public void turnOn() {
        System.out.println("Security system armed");
    }

    public void turnOff() {
        System.out.println("Security system disarmed");
    }
}

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        SmartDevice smartLight = new SmartLight();
        SmartDevice smartSecurity = new SmartSecurity();
        m.operate(smartLight);
        m.operate(smartSecurity);
    }

    public void operate(SmartDevice sd) {
        sd.turnOn();
        sd.turnOff();
    }
}
