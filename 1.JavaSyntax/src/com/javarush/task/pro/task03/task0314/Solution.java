package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        if (a.equalsIgnoreCase(secret))
        System.out.println("доступ разрешен");
        else
        System.out.println("доступ запрещен");
    }
}
