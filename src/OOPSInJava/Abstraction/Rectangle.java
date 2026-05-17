package OOPSInJava.Abstraction;

public class Rectangle extends Shape{

    private double length, height;
    private double area;

    Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }

    @Override
    double area(){
        area = length*height;
        return area;
    }
}
