package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList = A resizeable array that stores objects (autoboxing)
        //             Arrays are fixed in size, but ArrayLists can change

        ArrayList<Integer> list = new ArrayList<>();

//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        System.out.println(list);
//
//        ArrayList<String> fruits = new ArrayList<>();
//
//        fruits.add("Mango");
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Coconut");
//
//        fruits.remove(1);
//        fruits.set(1, "Pineapple");
//
//        System.out.println(fruits);
//        System.out.println(fruits.get(2));
//        System.out.println(fruits.size());
//
//        Collections.sort(fruits);
//
//        System.out.println(fruits);
//
//        for(String fruit : fruits){
//            System.out.print(fruit + " ");
//        }



        //Accept user input in ArrayList

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        int numOfFoods;
        System.out.print("Enter the # of foods: ");
        numOfFoods = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFoods; ++i){
            System.out.print("Enter food # " + i + " ");
            String food = scanner.nextLine();

            foods.add(food);
        }
        System.out.println(foods);

        scanner.close();
    }
}
