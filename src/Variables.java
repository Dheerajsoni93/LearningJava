import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {
        // ❎ variable = A reusable container for a value.
        //                          A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------        ---------
        //    int              string
        //    double           array
        //    char             object
        //    boolean

        int age = 23;
        int year = 2026;
        int quantity = 1;
        System.out.println("The year is " + year);

        double price = 21.99;
        double temperature = 25.3;

        System.out.println("₹" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '₹';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Dheeraj Soni";
        String food = "Pizza";
        System.out.println("Hello " + name);
        System.out.println("My favorite food is " + food);
    }
}
