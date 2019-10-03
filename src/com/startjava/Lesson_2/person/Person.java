package com.startjava.Lesson_2.person;

public class Person {

    String name = "Yasha";
    boolean sex = true; //true is for man, false is for woman
    double height = 180;
    double weight = 80.5;
    int age = 30;

    void move() {
    	System.out.println("You came to the next point");
    }

    void sit() {
    	System.out.println("Sat on sofa");
    }

    int run() {
    	return 5; 
    }

    String talk() {
    	return "Bla-bla-bla";
    }

    void learn() {
    	System.out.println("You learn Java");
    }
}

//Создайте класс Person
//Напишите в нем поля (атрибуты), описывающие характеристики человека: пол, имя, рост, вес, возраст
//Проинициализируйте их какими-то значениями
//Создайте в классе методы, описывающие поведение (что он может делать) человека: идти, сидеть, бежать, говорить, учить Java