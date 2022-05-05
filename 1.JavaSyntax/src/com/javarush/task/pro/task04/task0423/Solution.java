package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++ )
        {
            int x = console.nextInt();
            sum = sum + x;
        }
        System.out.println(sum / 5);
    }
}
