package OOPSInJava.Abstraction;

public class Main {
    public static void main(String[] args) {
        // abstract = Used to define abstract classes and methods.
        //                   Abstraction is the process of hiding implementation details
        //                   and showing only the essential features.
        //                   Abstract classes CAN'T be instantiated directly.
        //                   Can contain 'abstract' methods (which must be implemented)
        //                   Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5.5, 6.1);
//    Shape shape = new Shape(); -  it is a abstract class, it can't be instantiated

        circle.display();
        rectangle.display();

        System.out.printf("Area of circle is %.2f\n", circle.area());
        System.out.printf("Area of rectangle is %.2f\n", rectangle.area());
    }
}
