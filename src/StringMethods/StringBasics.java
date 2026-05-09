package StringMethods;

import java.sql.SQLOutput;

public class StringBasics {
    public static void main(String[] args) {

        String name = "Dheeraj Soni";

        int length = name.length();
        char letter = name.charAt(4);
        int index = name.indexOf('e');
        int lastIndex = name.lastIndexOf('e');

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);

//        name = "   Dheeraj Soni ";
//        name = name.trim();
//        name = name.replace('j','l');
//        name = name.toLowerCase();
//        name = name.toUpperCase();
//        System.out.println(name);

//        if(name.isEmpty()){
//            System.out.println("Your name is empty");
//        } else {
//            System.out.println("Hello " + name);
//        }

        /*
        if(name.contains(" ")){
            System.out.println("Your name containes space");
        } else {
            System.out.println("Your name does not contain space");
        }
        */

//        if(name.equals("Dheeraj Soni")){
//            System.out.println("Name matched");
//        } else {
//            System.out.println("Name does not match");
//        }
    }
}
