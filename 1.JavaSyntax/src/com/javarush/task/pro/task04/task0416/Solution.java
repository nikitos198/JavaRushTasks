package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;



public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int bottle = console.nextInt();
        int people = console.nextInt();
        System.out.println((double) bottle / people);
    }
}