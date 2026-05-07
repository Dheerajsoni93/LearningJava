package Java_Basics;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt(1, 7);   //1 is included and & is excluded.

        System.out.println(num);

        boolean isHead = random.nextBoolean();

        if(isHead){
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
