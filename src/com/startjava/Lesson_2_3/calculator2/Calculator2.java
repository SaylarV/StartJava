package com.startjava.Lesson_2_3.calculator2;

class Calculator2 {
   private int a;
   private int b;
   private char operation;   

   public void setA (int a){
        this.a = a;
   }

   public void setB (int b){
        this.b = b;
   } 

   public void setOperation (char operation){
        this.operation = operation;
   }               
        
        public void calculate () {
            if ((a >= 0) && (b >= 0)) {
                switch (operation) {
                case ('+'): System.out.println(a + b);
                            break;
                case ('-'): System.out.println(a - b);
                            break;
                case ('*'): System.out.println(a * b);
                            break;
                case ('/'): System.out.println(a / b);
                            break;
                case ('^'): System.out.println((int) Math.pow(a,b));;
                            break;
                case ('%'): System.out.println(a % b);
                            break;
                default: System.out.println("Incorrect operation! Operation's types: +, -, *, /, ^, %");
                }
            } else System.out.println("Enter positive integer!");            
        }    
}

//Модифицируйте программу Калькулятор:
//реализуйте дополнительный класс CalculatorTest
//для проверки знака математической операции воспользуйтесь оператором switch
//формат ввода математического выражения:
//Введите первое число: 2
//Введите знак математической операции: ^
//Введите второе число: 10