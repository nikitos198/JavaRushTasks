package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean ab = a + b > c;
        boolean ac = a + c > b;
        boolean bc = b + c > a;
        boolean ab1 = a + b <= c;
        boolean ac1 = a + c <= b;
        boolean bc1 = b + c <= a;

        if (ab && ac && bc)
            System.out.println(TRIANGLE_EXISTS);
        else if (ab1 || ac1 || bc1)
            System.out.println(TRIANGLE_NOT_EXISTS);
    }
}
