package com.startjava.Lesson_4.guessNumberArray;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessNumberArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell your name, first player");
        String firstPlayerName = scanner.next();
        System.out.println("Tell your name, second player");
        String secondPlayerName = scanner.next();
        System.out.println("Let's play a game! Guess number from 0 to 100! Everyone can try 10 times!");
        GuessNumber game = new GuessNumber();

        Player playerOne = new Player(firstPlayerName);
        Player playerTwo = new Player(secondPlayerName);

        int countTry = 1;
        String answer = "yes";
        ArrayList<Integer> playerOneNumbers = new ArrayList<>();
        ArrayList<Integer> playerTwoNumbers = new ArrayList<>();

        while(answer.equals("yes")) {

            while (!game.getWin()) {
                System.out.println(firstPlayerName + ", guess number");
                game.guess();
                playerOneNumbers.add(game.getNumber());
                if (game.getWin()) {
                    System.out.println("Player " + firstPlayerName + " guessed a number " + game.getNumber() +
                            " from " + countTry + " attempt" + ", congratulations!");
                    System.out.println("His numbers: ");
                    for (Integer playerOneNumber : playerOneNumbers) {
                        System.out.print(playerOneNumber + " ");
                    }
                    break;
                }
                System.out.println(secondPlayerName + ", guess number");
                game.guess();
                playerTwoNumbers.add(game.getNumber());
                if (game.getWin()) {
                    System.out.println("Player " + secondPlayerName + " guessed a number " + game.getNumber() +
                            " from " + countTry + " attempt" + ", congratulations!");
                    System.out.print("His numbers: ");
                    for (Integer playerTwoNumber : playerTwoNumbers) {
                        System.out.print(playerTwoNumber + " ");
                    }
                    break;
                }
                countTry++;
                if (countTry > 10) {
                    System.out.println("Too hard to say, but players ran out of attempts...");
                    break;
                }
            }
            System.out.println();
            System.out.println("Would you like next? Enter yes/no");
            countTry = 1;
            playerOneNumbers.clear();
            playerTwoNumbers.clear();
            game.setWin(false);
            answer = scanner.next();
        }
    }

    public static class GuessNumber{
        int number;
        Scanner scanner = new Scanner(System.in);
        int rand = (int) (100*Math.random()+1);
        boolean win = false;

        public void guess() {
                number = scanner.nextInt();
                if (number > rand) System.out.println("No, number is lower");
                else if (number < rand) System.out.println("No, number is bigger");
                else {
                    System.out.println("You won!");
                    win = true;
                    rand = (int) (100*Math.random()+1);
                }
        }

        int getNumber (){
            return number;
        }
        boolean getWin (){
            return win;
        }
        public void setWin(boolean win) {
            this.win = win;
        }
    }

    public static class Player{
        String name;

        public Player(String name){
            this.name = name;
        }

    }
}

//        Модифицируйте программу Угадай число, используя для хранения, названных игроками чисел, массивы:
//        перед началом игры выведите сообщение: У вас 10 попыток
//        по окончанию игры отобразите, в две строки через пробел, все названные игроками числа
//        если массив полностью не заполнен, т.е. пользователь угадал число менее чем за 10 попыток, то выводить весь массив не нужно
//        в конце игры выведите сообщение "Игрок " + имя + " угадал число " + число + " с " + номер + " попытки"
//        если игроки не угадали число за 10 попыток, то отобразите сообщение: "У " + имя + " закончились попытки"
//
//        Создайте дополнительное поле в классе Player, которое будет хранить введенные пользователем числа
//        Для считывания части массива используйте метод Arrays.copyOf
//        Для обнуления массивов игроков, при повторном запуске игры, используйте метод Arrays.fill().
//        При этом обнуляйте только те ячейки, где хранятся, названные игроками числа
//        Попробуйте улучшить читаемость кода, разделив его на небольшие методы (рефакторинг)