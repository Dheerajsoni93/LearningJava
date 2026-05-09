package StringMethods;

import java.util.Scanner;

public class SubstringMethods {
    public static void main(String[] args) {
//        substring() -> it is used to extract a portion of string.substring(start, end)
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email");

        email = scanner.nextLine();

        if(email.contains("@")) {

            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Email: " + email);
            System.out.println("username " + username);
            System.out.println("domain " + domain);
        } else {
            System.out.println("Email does not contain @, please enter a valid email");
        }

        scanner.close();
    }
}
