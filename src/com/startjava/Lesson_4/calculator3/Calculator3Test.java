package com.startjava.Lesson_4.calculator3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Calculator3Test {
   public static void main(String[] args) throws PatternSyntaxException, NumberFormatException {
       Calculator3 calc = new Calculator3();
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter mathmatic term (for example: 2*5):");
       String mathTerm = scanner.next().replaceAll("\\s+", ""); //удаляю пробелы, если вдруг человек их ввел
       String[] operators = {"+", "-", "*", "/", "^", "%"};
       String answer = "yes";

       for (int i = 0; i < operators.length; i++) {
           if (mathTerm.contains(operators[i])) {
               String[] string = mathTerm.split("\\" + operators[i], 2);
               int a = Integer.parseInt(string[0]);
               String operation = operators[i];
               int b = Integer.parseInt(string[1]);
               calc.setA(a);
               calc.setB(b);
               calc.setOperation(operation);
               calc.calculate();
           }
       }
       System.out.println("Thank you! Bye!");
   }
}

// Модифицируйте программу Калькулятор, используя для хранения значений математического выражения массивы:
// воспользуйтесь методами класса Math, какие только сможете найти,
// заменив ими ваши реализации, связанные с вычислениями
// для разбиения математического выражения на составляющие и сохранения их в массив,
// используйте метод String.split();