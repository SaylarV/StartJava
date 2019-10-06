package com.startjava.Lesson_2_3.jaeger;

public class JaegerTest{
	public static void main (String[] args){
		Jaeger jagOne = new Jaeger ("Altrone");
		Jaeger jagTwo = new Jaeger ("Valli", 20, 5);
		System.out.println(jagOne.getName());
		System.out.println(jagTwo.getWeight());
		jagOne.voice();
	}
}