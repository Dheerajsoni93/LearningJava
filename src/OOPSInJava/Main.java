package OOPSInJava;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Object = An entity that holds data (attributes)
        //                and can perform actions (methods)
        //                It is a reference data type

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car car1 = new Car();
        Car car2 = new Car();
//        System.out.println(car1.model);
//        System.out.println(car1.make);
//        System.out.println(car1.year);
//        System.out.printf("%,.2f\n", car1.price);
//        System.out.println(car1.isRunning);

        car1.start();
        System.out.println("Is car1 running? " + car1.isRunning);
        System.out.println("Is car2 running? " + car2.isRunning);
        car1.stop();
        System.out.println("Is car1 running? " + car1.isRunning);
        System.out.println("Is car2 running? " + car2.isRunning);
    }
}

