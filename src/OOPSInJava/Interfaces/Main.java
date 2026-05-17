package OOPSInJava.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementing classes MUST define.
        //             Supports multiple inheritance-like behavior.

        Rabbit rabbit = new Rabbit();   //if a class is implementing interfaces, it should define methods of interfaces
        Fish fish = new Fish();     //a class can implements more than one Interfaces
        Hawk hawk = new Hawk();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();
    }
}
