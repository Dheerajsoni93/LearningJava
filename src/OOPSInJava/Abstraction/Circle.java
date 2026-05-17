package OOPSInJava.Abstraction;

public class Circle extends Shape{

    private double radius;
    private double area;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        area = ((double) 22/7)*radius*radius;
        return area;
    }
}
