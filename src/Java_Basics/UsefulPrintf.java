package Java_Basics;

import java.util.Scanner;

public class UsefulPrintf {
    public static void main(String[] args) {
        // printf() is a method used to format output

        // % [flags] [width] [.precision] [specifier-character]

        Scanner scanner = new Scanner(System.in);

        // [specifier-character]
        String name = "Dheeraj Soni";
        char firstLetter = 'D';
        int age = 23;
        double height = 71.5;
        boolean isStudent = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with letter %c\n", firstLetter);
        System.out.printf("Your age: %d\n", age);
        System.out.printf("Your are %.2f inches tall\n", height);
        System.out.printf("Student: %b\n", isStudent);

        // [.precision]
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        // [flags]

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        System.out.printf("%f\n", price1);
        System.out.printf("%f\n", price2);
        System.out.printf("%f\n", price3);

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("id: %4d\n", id1);
        System.out.printf("id: %-4d\n", id2);
        System.out.printf("id: %04d\n", id3);
        System.out.printf("id: %04d\n", id4);
    }
}
