package Generics;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

            //Generics = A concept where you can write a class, interface, or method
            //that is compatible with different data types.
//            <T, U> type parameter (placeholder that gets replaced with a real type)
//          <String> type argument (specifies the type)

//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Mango");
//        fruits.add("Apple");
//        fruits.add("Orange");

        Box<String> box = new Box<>();
        box.setItems("Apple");

        System.out.println(box.getItems());

        Product<String, Double> product = new Product<>("Mango", 20.5);
        System.out.println(product.getItem() + " " + product.getPrice());

        Product<String, Integer> product2 = new Product<>("Orange", 15);
        System.out.println(product2.getItem() + " " + product2.getPrice());
    }
}
