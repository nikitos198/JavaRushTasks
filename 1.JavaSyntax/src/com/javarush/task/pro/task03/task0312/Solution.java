package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String string1 = str.nextLine();
        String string2 = str.nextLine();
        if (string1.equals(string2))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}
