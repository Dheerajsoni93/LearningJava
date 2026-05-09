package Java_Basics;

import javax.xml.transform.Source;
import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

        //Enhanced Switch -> A Java14 feature and a replacement for many if-else statements.

        Scanner scanner = new Scanner(System.in);
        String day;
        System.out.print("Enter the day: ");
        day = scanner.nextLine();

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday!");
            case "Saturday", "Sunday" ->
                    System.out.println("It is a weekend!");
            default -> System.out.println("Not a valid day");
        }
        scanner.close();
    }
}
