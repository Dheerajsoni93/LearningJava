package OOPSInJava.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods
        //                         from another class.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);   //accessing variable of GrandParent class from grandchild class object
        dog.speak();  //calling method using object of own class
        dog.eat();   //calling method of parent class from object of child class
        cat.speak();    //calling method using object of own class
        cat.eat();  //calling method of parent class from object of child class
        plant.photosynthesis();
        System.out.println(plant.isAlive);
    }
}
