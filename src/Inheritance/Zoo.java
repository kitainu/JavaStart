package Inheritance;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color = "Czarny";
        Bird bird = new Bird();
        bird.color = "Niebieski";
        System.out.println("Zwierzęta dają głos: ");
        System.out.println("Kot : ");
        cat.makeSound();
        System.out.println("Ptak : ");
        bird .makeSound();
    }
}
