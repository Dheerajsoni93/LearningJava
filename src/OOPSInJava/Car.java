package OOPSInJava;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 5500000;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine.");
    }

    void stop(){
        System.out.println("You stopped the engine.");
        isRunning = false;
    }
}
