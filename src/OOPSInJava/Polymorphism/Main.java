package OOPSInJava.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Runtime polymorphism = When the method that gets executed is decided
        //                        at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        Animal animal;
        int choice;

        System.out.println("What animal do you like? (1 for Dog and 2 for Cat): ");
        choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        } else if(choice == 2){
            animal = new Cat();
            animal.speak();
        } else {
            System.out.println("Please enter a valid input!");
        }
    }
}
