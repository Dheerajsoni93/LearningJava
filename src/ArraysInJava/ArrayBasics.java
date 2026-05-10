package ArraysInJava;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Banana", "Orange", "Coconut"};
        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        for(int i = 0; i < numOfFruits; ++i){
            System.out.print(fruits[i] + " ");
        }

        Arrays.sort(fruits);
//        Arrays.fill(fruits, "Pineapple");

        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
    }
}
