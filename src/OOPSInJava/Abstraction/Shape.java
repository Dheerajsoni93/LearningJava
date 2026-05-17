package OOPSInJava.Abstraction;

abstract public class Shape {
    abstract double area(); //ABSTRACT method - need implementation in child class.

    void display(){ // CONCRETE method - no need to implement in child class.
        System.out.println("This is a shape");
    }
}
