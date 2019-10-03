package com.startjava.Lesson_2.jaeger;

public class Jaeger{

	private String name;
	private double weight;
	private int speed;

	public String getName(){
		return name;
	}

	public double getWeight(){
		return weight;
	}

	public Jaeger(String name){
		this.name = name;
	}

	public Jaeger(String name, double weight, int speed){
		this.name = name;
		this.weight = 45;
		this.speed = speed;
	}

	public void voice(){
		System.out.println("Attack!!!");
	}
}

//Модифицируйте класс Jaeger, сделав его универсальным (без инициализации полей в самом классе, 
//как мы это делали в уроке). Это позволит на его основе создавать любого робота:
//информацию о роботах можно найти здесь
//выберите два или более разных роботов. Найдите между ними что-то общее (поля, методы). 
//Реализуйте это в коде (не усложняйте реализацию. Делайте все максимально просто)
//создайте 2 экземпляра класса Jaeger и поэкспериментируйте с ними (проинициализируйте поля, 
//вызывайте методы, перезаписывайте и выводите значения полей)
//для инициализации полей объектов при их создании используйте в начале сеттеры 
//(покажите решение ментору), а потом перепишите, используя конструктор