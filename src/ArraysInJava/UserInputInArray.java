package ArraysInJava;

import java.util.Scanner;

public class UserInputInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String[] foods = new String[];

        int size;
        System.out.print("What # of foods do you want? ");
        size = scanner.nextInt();
        scanner.nextLine();
        String[] foods = new String[size];

        for(int i = 0; i < size; ++i){
            System.out.print("Enter the food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.print(food + " ");
        }

        scanner.close();
    }
}
