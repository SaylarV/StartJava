package com.startjava.Lesson_2_3.wolf;

public class WolfTest {

	public static void main(String[] args){
		Wolf wolfOne = new Wolf();
		System.out.println("name: " + wolfOne.getName());
		System.out.println("age: " + wolfOne.getAge());
		wolfOne.setColor("White");		
		System.out.println("color: " + wolfOne.getColor());
		System.out.println(wolfOne.voice());
	}    
}

//Создайте класс WolfTest с методом main
//создайте объект типа Wolf
//присвойте в нем полям экземпляра класса Wolf какие-то значения
//считайте эти значения из полей и отобразите в консоли
//вызовите методы объекта

//Модифицируйте класс WolfTest
//с помощью сеттеров присвойте полям экземпляра класса Wolf какие-то значения
//считайте эти значения из полей с помощью геттеров и отобразите в консоли