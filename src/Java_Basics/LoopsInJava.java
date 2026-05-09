package Java_Basics;

import java.util.Scanner;

public class LoopsInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //While Loop
        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        while(age < 0){
            System.out.println("your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("Your age is: " + age);

        //For loop
        for (int i = 0; i < 10; ++i){
            System.out.print(i + ", ");
        }
        //break - to break the loop
        //continue - skip the current iteration and jump to next

//        do-while loop
        int number;
        do{
            System.out.print("Enter the number between 1 to 10: ");
            number = scanner.nextInt();
        } while(number < 1 || number > 10);
        System.out.println("You picked the number: " + number);
    }
}
