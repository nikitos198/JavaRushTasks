package com.javarush.task.pro.task04.task0407;

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        while (num <= 100) {
            if (num % 3 == 0) {
                num++;
                continue;
            }
            sum = sum + num;
            num++;
        }
        System.out.println(sum);
    }
}