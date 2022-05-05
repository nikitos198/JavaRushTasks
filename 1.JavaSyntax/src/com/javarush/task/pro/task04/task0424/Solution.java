package com.javarush.task.pro.task04.task0424;

import java.util.Scanner;

/* 
Бомба в ядре планеты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);
        int numbers;
        do
        {
            numbers = bombInterface.nextInt();
            System.out.println(numbers);
        }
        while (numbers % 10 != 0);
    }
}
