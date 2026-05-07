package Java_Basics;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int z;
//        z = x+y;
//        z = x-y;
//        z = x/y;
//        z = x*y;
        z = x%y;
        System.out.println(z);

        //Augmented Arithmetic Operations
        x += y;
        System.out.println(x);

        //increment and decrement operations
        x++;
        x--;

        //order of operations [P-E-M-A-D-S] Parentheses-Exponents-multiplication-division-addition-subtraction

        double result = 2 + 3 - (7-2) * 6/2;
        System.out.println(result);
    }
}
