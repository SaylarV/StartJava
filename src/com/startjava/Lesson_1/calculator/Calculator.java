package com.startjava.Lesson_1.calculator;

public class Calculator {	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Введите номер операции от 1 до 6:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление без остатка");
        System.out.println("5. Возведение в степень");
        System.out.println("6. Остаток от деления");
        int operation = scanner.nextInt();
        System.out.println("Введите первое целое положительное число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое положительное число:");
        int b = scanner.nextInt();        
        
        int result;
        if ((a >= 0) && (b >= 0)) {
            if (operation == 1) {
                result = a + b;
                System.out.println(result);
            } else if (operation == 2) {
                result = a - b;
                System.out.println(result);
            } else if (operation == 3) {
                result = a * b;
                System.out.println(result);
            } else if (operation == 4) {
                result = a / b;
                System.out.println(result);
            } else if (operation == 5) {
                result = (int) Math.pow(a,b);
                System.out.println(result);
            } else if (operation == 6) {
                result = a % b;
            } else System.out.println("Номер операции должен быть от 1 до 6");
        } else System.out.println("Введите положительные числа!");

        scanner.close();
    }
}