package InnerClass;

class MessagePrinter {
    void printMessage(String message) {
        class Printer {
            void display() {
                System.out.println("Message: " + message);
            }
        }

        Printer printer = new Printer();
        printer.display();
    }
}

public class Main4 {
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.printMessage("Hello, Local Class!");
    }
}