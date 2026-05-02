import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your GPA: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your GPA is " + gpa);
//
//        if(isStudent){
//            System.out.println("You are a student");
//        } else {
//            System.out.println("You are not a student");
//        }

        //COMMON ISSUES
        System.out.print("Enter the price: ");
        int price = scanner.nextInt();
        scanner.nextLine(); //while entering the int value we hit the enter which makes the input as 2000\n and \n will be treated as next input.

        System.out.println("Enter the color of shirt: ");
        String color = scanner.nextLine();

        System.out.println("The price of " + color + " shirt is " + price);

        scanner.close();
    }
}
