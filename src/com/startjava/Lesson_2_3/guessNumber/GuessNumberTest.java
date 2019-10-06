package com.startjava.Lesson_2_3.guessNumber;

import java.util.Scanner;
public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell your name, first player");
        String firstPlayerName = scanner.next();
        System.out.println("Tell your name, second player");
        String secondPlayerName = scanner.next();
        System.out.println("Let's play a game! Guess number from 0 to 100!");
        GuessNumber game = new GuessNumber();

        Player playerOne = new Player(firstPlayerName);
        Player playerTwo = new Player(secondPlayerName);

        while(!game.getWin()){
            System.out.println(firstPlayerName + ", guess number");
            game.guess();
            if (game.getWin()) {
                System.out.println(firstPlayerName + ", congratulations!");
                break;
            }
            System.out.println(secondPlayerName + ", guess number");
            game.guess();
            if (game.getWin()) {
                System.out.println(secondPlayerName + ", congratulations!");
                break;
            }
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
                }
        }

        boolean getWin (){
            return win;
        }
    }

    public static class Player{
        String name;

        public Player(String name){
            this.name = name;
        }

    }
}

//Модифицируйте программу Угадай число:
//реализуйте класс GuessNumber, Player и GuessNumberTest
//создайте двух игроков, которые по очереди будут пытаться угадать число, загаданное компьютером
//введите с клавиатуры в начале игры имена каждого игрока
//все объекты, создаваемые в программе, инициализируйте с помощью конструкторов
//для генерации компьютером псевдослучайного числа в диапазоне от 0 до 100 используйте класс Random или Math.random()
//Назначение классов в игре Угадай число:
//GuessNumber — отвечает за сам процесс игры и логику ее работы
//Player — описывает игроков (один экземпляр класса соответствует одному игроку)
//GuessNumberTest — предназначен для запуска игры; создания объектов; инициализации объектов с помощью конструкторов
//Для завершения или продолжения работы программ Калькулятор и Угадай число выводите сообщение: "Хотите продолжить? [да/нет]: "
//Если пользователь ввел ни "да" ни "нет", а что-то другое — снова выведите сообщение из п.4
//Не забывайте указывать для полей и методов модификаторы доступа
//Класс Player должен иметь следующие поля и методы:
//String name — имя игрока (одного!)
//int number — введенное пользователем число
//геттеры/сеттеры (по необходимости)