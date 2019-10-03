package com.startjava.Lesson_1.guessNumber;
import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rand = (int) (100*Math.random()+1);
        System.out.println("Guess number from 0 to 100!");

        int number;
        do{
            number = scanner.nextInt();
            if (number > rand) {
                System.out.println("Try Lower");
            }
            else if (number < rand) {
                System.out.println("Try bigger");
            }
            else {
                System.out.println("You won!");
            }
        } while (number != rand);

        scanner.close();
    }
}