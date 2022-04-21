package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;



public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String one = console.nextLine().toLowerCase();
        String two = console.nextLine().toUpperCase();
        String three = console.nextLine();

        System.out.println(three);
        System.out.println(two);
        System.out.println(one);
    }
}
