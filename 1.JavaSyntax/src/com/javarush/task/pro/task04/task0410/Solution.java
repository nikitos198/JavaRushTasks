package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       int min = console.nextInt();// если 9
       int min2 = console.nextInt();// если 1
        if (min > min2){
            int temp = min2;
            min2 = min;
            min = temp;
            }
        while (console.hasNextInt()){
            int num = console.nextInt();
            if (min == min2 && num > min){
                min2 = num;
            } else if (num < min) {
                min2 = min;
                min = num;
            } else if (num > min && num < min2) {
                min2 = num;
            }
        }
        System.out.println(min2);

    }
}