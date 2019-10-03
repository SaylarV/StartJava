package com.startjava.Lesson_1.cycle;

public class Cycle {	
    public static void main(String[] args) {        
        for (int i = 0; i <= 20; i++){
            System.out.print(i + " ");
        }        
        System.out.println();                
        int k = 6;
        while(k >= -6){
            System.out.print(k + " ");
            k = k + 2;
        }        
        System.out.println();
        int j = 10;
        int sun = 0;
        do {
            if (j%2 != 0) sum = sum + j;            
            j++;
        } while (j <= 20);
        System.out.println(sum);        
    }
}