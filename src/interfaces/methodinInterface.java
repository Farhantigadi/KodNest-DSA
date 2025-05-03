package interfaces;


interface Animal {
    void makeSound(); // Abstract method with no code
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

 class  methodinInterface {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Bark

        Animal myCat = new Cat();
        myCat.makeSound();  // Output: Meow
    }
}
