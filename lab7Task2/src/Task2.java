public class Task2 {
    abstract static class Animal {
        String name;
        int age;
        double weight;

        public abstract void eat();

        public abstract void getVoice();
    }

    static class Mammal extends Animal {
        String furColor;

        public Mammal(String Name,int Age,double  Weight,String furColor){
            this.name = Name;
            this.age = Age;
            this.weight = Weight;
            this.furColor = furColor;
        }
        public Mammal(){

        }

        @Override
        public void eat() {

        }

        @Override
        public void getVoice() {

        }
    }

    static class Bird extends Animal {
        String FeatherColour;
        public Bird(String Name,int Age,double  Weight,String featherColour){
            this.name = Name;
            this.age = Age;
            this.weight = Weight;
            this.FeatherColour = featherColour;
        }
        public Bird()
        {}

        @Override
        public void eat() {}

        @Override
        public void getVoice() {}
    }

    static class Fish extends Animal {
        String ScaleColour;
        public Fish(String Name,int Age,double Weight,String scaleColour){
            this.name = Name;
            this.age = Age;
            this.weight = Weight;
            this.ScaleColour = scaleColour;
        }

        public Fish() {

        }

        @Override
        public void eat() {
            System.out.println(name + " is nibbling at some food.");
        }

        @Override
        public void getVoice() {
            System.out.println(name + " is swimming silently.");
        }
    }

    static class BlowFish extends Fish {
        int Diameter;
        public BlowFish(String Name,int Age,double  Weight,String scaleColour, int diameter){
            super();
            this.name = Name;
            this.age = Age;
            this.weight = Weight;
            this.ScaleColour = scaleColour;
            this.Diameter = diameter;
        }

        @Override
        public void eat() {
            super.eat();
            System.out.println("BlowFish likes to eat small crustaceans and mollusks.");
        }

        @Override
        public void getVoice() {
            super.getVoice();
            System.out.println("BlowFish cannot make a sound, but can inflate to defend itself.");
        }
    }

    static class Pigeon extends Bird {
        String species;
        public Pigeon(String Name,int Age,double  Weight,String featherColour, String Species){
            super();
            this.name = Name;
            this.age = Age;
            this.weight = Weight;
            this.FeatherColour = featherColour;
            this.species = Species;
        }

        @Override
        public void eat() {
            super.eat();
            System.out.println("Pablo likes to eat seeds and grains.");
        }


        @Override
        public void getVoice() {
            System.out.println("Pablo makes a cooing sound.");
        }
    }

    static class Dog extends Mammal {
        String Breed;

        public Dog(String Name, int Age, double Weight, String furColor, String breed) {
            super();
            this.name = Name;
            this.age = Age;
            this.weight = Weight;
            this.furColor = furColor;
            this.Breed = breed;
        }

        public void eat() {
            System.out.println("Eats meat!");
        }

        @Override
        public void getVoice() {
            super.getVoice();
            System.out.println(name + " is barking.");
        }
    }

    public static void main(String[] args) {
        Animal[] animal = new Animal[6];
        animal[0]= new Mammal("Little Brown",3,5,"brown");
        animal[1] = new Dog("Cassie",3,24," black","Mastiff");
        animal[2] = new Bird("Owl",2,15,"White");
        animal[3] = new Pigeon("Pablo",3,2,"Grey","White noose");
        animal[4] = new Fish("Calamari",1,1,"Gold");
        animal[5] = new BlowFish("BlowFish",4,6,"Light grey",10);

        animal[4].getVoice();
        animal[1].getVoice();
        animal[3].eat();
    }
}