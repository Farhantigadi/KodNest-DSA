package Abstract;

abstract class Bird {
    abstract void eat();
    abstract void fly();
    abstract void sleep();
}

abstract class Eagle extends Bird {


    @Override
    void sleep() {
        System.out.println("Eagle is sleeping");
    }

    @Override
    void fly() {
        System.out.println("Eagle is flying");
    }
}

abstract class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void sleep() {
        System.out.println("Sparrow is sleeping");
    }
}

final class MountEagle extends Eagle {
    @Override
    void eat() {
        System.out.println("Mount Eagle is eating");
    }
}

final class SerpentEagle extends Eagle {
    @Override
    void eat() {
        System.out.println("Serpent Eagle is eating snakes");
    }
}

final class VegSparrow extends Sparrow {
    @Override
    void eat() {
        System.out.println("Veg Sparrow is eating grains");
    }
}

final class NonVegSparrow extends Sparrow {
    @Override
    void eat() {
        System.out.println("Non-Veg Sparrow is eating fish");
    }
}

class Main {
    public static void main(String[] args) {
        MountEagle mountEagle = new MountEagle();
        SerpentEagle serpentEagle = new SerpentEagle();
        VegSparrow vegSparrow = new VegSparrow();
        NonVegSparrow nonVegSparrow = new NonVegSparrow();

        call(mountEagle);
        call(serpentEagle);
        call(vegSparrow);
        call(nonVegSparrow);
        /*we can also do like this
       call(new MountEagle())
         */
    }

    static void call(Bird bird) {
        bird.eat();
        bird.sleep();
        bird.fly();
        System.out.println();
    }
}
