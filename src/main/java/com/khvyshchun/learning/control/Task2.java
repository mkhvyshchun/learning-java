package com.khvyshchun.learning.control;
//Задано два цілих числа. Написати вираз, який перевіряє, чи остання цифра меншого з цих чисел дорівнює  3.

public class Task2 {
    public static void main(String[] args) {
        int num1 = 53;
        int num2 = 53;
        if(num1 != num2){
            int minNum = num1 < num2 ? num1 : num2 ;
            if (minNum % 10 == 3){
               System.out.println("число");
            }
        }
//        if(num1 < num2 && num1 != num2){
//            if (num1 % 10 == 3){
//                System.out.println("число");
//            }
//        }else if(num1 != num2)
//        {
//            if (num2 % 10 == 3){
//                System.out.println("число");}
//        }
    }
}
