public class AnimalSimulator {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Bark();

        Animal animal = new Dog();
        animal.makeSound();

        Animal x = GetAnimal();
        x.makeSound();
    }

    public static Animal GetAnimal() {
        return new Cat();
    }
}