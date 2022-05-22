package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x = console.nextInt();
        int speed = (int) Math.round(x * 3.6);
        System.out.println(speed);
    }
}