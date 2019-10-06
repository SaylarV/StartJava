package com.startjava.Lesson_4.calculator3;

class Calculator3 {
   private int a;
   private int b;
   private String operation;

   public void setA (int a){
       this.a = a;
   }
   public void setB (int b){
       this.b = b;
   }
   public void setOperation (String operation){
       this.operation = operation;
   }               
        
        public void calculate () {
            if ((a >= 0) && (b >= 0)) {
                switch (operation) {
                case ("+"): System.out.println(a + b);
                            break;
                case ("-"): System.out.println(a - b);
                            break;
                case ("*"): System.out.println(a * b);
                            break;
                case ("/"): System.out.println(a / b);
                            break;
                case ("^"): System.out.println((int) Math.pow(a,b));;
                            break;
                case ("%"): System.out.println(a % b);
                            break;
                default: System.out.println("Incorrect operation! Operation's types: +, -, *, /, ^, %");
                }
            } else System.out.println("Enter positive integer!");            
        }    
}

// Модифицируйте программу Калькулятор, используя для хранения значений математического выражения массивы:
// воспользуйтесь методами класса Math, какие только сможете найти,
// заменив ими ваши реализации, связанные с вычислениями
// для разбиения математического выражения на составляющие и сохранения их в массив,
// используйте метод String.split();