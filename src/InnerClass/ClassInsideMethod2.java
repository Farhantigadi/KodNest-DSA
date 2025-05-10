package InnerClass;

class GreetingGenerator {
    String generateGreeting(String name, String time) {
        class Greeting {
            String greet() {
                return "Good " + time + ", " + name + "!";
            }
        }

        Greeting greeting = new Greeting();
        return greeting.greet();
    }
}

public class ClassInsideMethod2 {
    public static void main(String[] args) {
        GreetingGenerator generator = new GreetingGenerator();
        String greeting = generator.generateGreeting("Alice", "morning");
        System.out.println(greeting);
    }
}