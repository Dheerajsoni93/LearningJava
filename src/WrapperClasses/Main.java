package WrapperClasses;

public class Main {
    public static void main(String[] args) {
        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static utility methods.

        //Autoboxing
//        Integer a = 123;
//        Double b = 3.14;
//        Character c = 'D';
//        Boolean d = true;

        //Unboxing
//        int x = a;

        //Use of Wrapper class and its "toString" method to wrap a primitive data type into String.
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('D');
        String d = Boolean.toString(true);

        String x = a + b + c + d;
        System.out.println(x);


        //parsing
//        int i = Integer.parseInt("123");
//        double dou = Double.parseDouble("3.14");
//        char ch = "Dheeraj".charAt(0);  //char doesn't have wrapper class
//        boolean flag = Boolean.parseBoolean("false");

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}
