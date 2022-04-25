package com.javarush.task.pro.task04.task0421;


public class Solution {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            if (num % 2 == 0) {
                sum = num + sum;
            }
            num++;
        }
        System.out.println(sum);
    }
}