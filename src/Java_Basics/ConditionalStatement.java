package Java_Basics;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age == 0){
            System.out.println("You are a baby!");
        } else if (age > 0 && age < 18) {
            System.out.println("You are a child!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("Invalid age");
        }
    }
}
