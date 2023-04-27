public class Main {
    public static void main(String[] args) {
        AnimalBehavior[] animalBehaviors = new AnimalBehavior[3];

        animalBehaviors[0] = new Dog("Cassie");
        animalBehaviors[1] = new Pigeon("Pablo");
        animalBehaviors[2] = new Blowfish("BlowFish");

        for (AnimalBehavior animalBehavior : animalBehaviors) {
            AnimalName.name(((Animal)animalBehavior).getName());
            ((Animal)animalBehavior).makeSound();
            ((AnimalMove)animalBehavior).move();

            animalBehavior.sleep();
        }
    }
}