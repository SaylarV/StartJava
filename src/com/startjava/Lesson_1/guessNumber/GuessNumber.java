package com.startjava.Lesson_1.guessNumber;

public class GuessNumber {	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rand = (int) (100*Math.random()+1);
        System.out.println("Угадай число от 0 до 100!");

        int number;
        do{
            number = scanner.nextInt();
            if (number > rand) System.out.println("Искомое число меньше");
            else if (number < rand) System.out.println("Искомое число больше");
            else System.out.println("Вы угадали!");
        } while (number!=rand);

        scanner.close();
    }
}