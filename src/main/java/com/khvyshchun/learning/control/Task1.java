package com.khvyshchun.learning.control;
 //Задано певний рік. Визначити, чи цей рік високосний.
// Підказка: високосним вважається рік, що цілочислово ділиться на 4, але не ділиться на 100,
// крім років, що діляться на 400 (2000 рік високосний, а 1900 – ні).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введіть рік\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println("Ви ввели :"+line);
        int year = Integer.parseInt(line);
        if (year % 4 == 0 || year % 100 != 0) {
            System.out.println("рік високосний");
        } else {
            System.out.println("Рік не високосний");
        }
    }
}
