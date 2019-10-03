package com.startjava.Lesson_2.wolf;

public class Wolf {

    private boolean sex = true; //true for male, false for female
    private String name = "Sharik";
    private double weight = 40;
    private int age = 7;
    private String color = "Grey";

    public String getName() {
        return name;
    }

    void setName (String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    void setAge (int age) {
        if (age > 8){
            System.out.println("Incorrect age");
        } else {
            this.name = name;
        }
    }

    public boolean getSex() {
        return sex;
    }

    void setSex (boolean sex) {
        this.sex = sex;
    }

     public double getWeight() {
        return weight;
    }

    void setWeight (double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    void setColor (String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("5 meters");
    }

    public boolean sit() {
        return true; //true for yes, false for no
    }

    public void run() {
        System.out.println("2 km");
    }

    public String voice(){
        return "Gav";
    }

    public void hunt() {

    }
}

//Создайте класс Wolf
//напишите в нем поля: пол, кличка, вес, возраст, окрас
//напишите в нем методы: идти, сидеть, бежать, выть, охотиться

//Модифицируйте класс Wolf
//у всех полей класса напишите модификатор доступа private
//у всех методов класса напишите модификатор доступа public
//для доступа к полям создайте геттеры и сеттеры
//в сеттере поля age реализуйте проверку: если возраст волка > 8 лет, то выведите сообщение "Некорректный возраст"