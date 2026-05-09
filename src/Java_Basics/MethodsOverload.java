package Java_Basics;

public class MethodsOverload {
    public static void main(String[] args) {
        //overload methods = methods that share the same name, but different parameters signature
        System.out.println(add(1, 2, 3));
    }

    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
}
