interface AnimalBehavior {
    void sleep();
}

interface AnimalMove {
    default void move() {
        System.out.println(this.getClass().getSimpleName() + " moves");
    }
}

interface AnimalName {
    static void name(String name) {
        System.out.println("Name of the Animal is: " + name);
    }
}

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public String getName() {
        return this.name;
    }
}

class Dog extends Animal implements AnimalBehavior, AnimalMove {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " is Barking...");
    }
    public void move() {
        System.out.println(name+ " runs");
    }


    public void sleep() {
        System.out.println(name + " is sleeping");
        System.out.println();
    }

}



class Pigeon extends Animal implements AnimalBehavior, AnimalMove {
    public Pigeon(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Coo");
    }

    public void sleep() {
        System.out.println("Pigeon Pablo sleeps");
        System.out.println();
    }

    public void move() {
        System.out.println("Pigeon Pablo flies");
    }
}

class Blowfish extends Animal implements AnimalBehavior, AnimalMove {
    public Blowfish(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("brrrrrrrr");
    }

    public void sleep() {
        System.out.println("Blowfish sleeps");
    }

    public void move() {
        System.out.println("Blowfish swims");
    }
}

