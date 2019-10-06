package com.startjava.Lesson_2_3.calculator2;

import java.util.Scanner;
public class Calculator2Test {	
   public static void main(String[] args) {        
        Calculator2 calc = new Calculator2();
        Scanner scanner = new Scanner(System.in);

        String answer = "yes";        
        while(answer.equals("yes")){
            System.out.println("Enter first positive integer:");
            int a = scanner.nextInt();
            calc.setA(a);

            System.out.println("Enter second positive integer:");
            int b = scanner.nextInt();
            calc.setB(b);

            System.out.println("Choose and enter operation: +, -, *, /, ^, %");
            char operation = scanner.next().charAt(0);
            calc.setOperation(operation);

            calc.calculate();

            System.out.println("Would you like next? Enter yes/no");
            answer = scanner.next();
        }
    System.out.println("Thank you! Bye!");       
    }    
}

//Модифицируйте программу Калькулятор:
//реализуйте дополнительный класс CalculatorTest
//для проверки знака математической операции воспользуйтесь оператором switch
//формат ввода математического выражения:
//Введите первое число: 2
//Введите знак математической операции: ^
//Введите второе число: 10
//Для завершения или продолжения работы программ Калькулятор и Угадай число выводите сообщение: "Хотите продолжить? [да/нет]: "
//Если пользователь ввел ни "да" ни "нет", а что-то другое — снова выведите сообщение из п.4