package com.startjava.Lesson_1.conditionalstatement;

public class ConditionalStatement {	
    public static void main(String[] args) {

        int age = 50;  
        if (age > 20) System.out.println(">20");
        boolean isMan = true;
        if (isMan == true) System.out.println("man");
        if (isMan == false) System.out.println("not man");
        double height = 160;
        if (height < 1.8) System.out.println("you are short");
        else System.out.println("you are tall");
        String name = "Vitaly";
        if (name.charAt(0) == 'M') System.out.println("first M");
        else if (name.charAt(0) == 'I') System.out.println("first I");
        else System.out.println("first " + name.charAt(0));        
    }
}