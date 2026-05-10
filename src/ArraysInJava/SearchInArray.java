package ArraysInJava;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;
        int size,target;
        boolean isFound = false;
        System.out.println("Enter the # of elements: ");
        size = scanner.nextInt();

        numbers = new int[size];

        for(int i = 0; i < size; ++i){
            System.out.print("Enter the element: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the target: ");
        target = scanner.nextInt();

        for(int i = 0; i < size; ++i){
            if(numbers[i] == target){
                System.out.println("Target is present at position: " + i+1);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Target not found!");
        }
        scanner.close();
    }
}
