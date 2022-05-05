package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String string = console.nextLine();
            if (string.equals("enough")){
                break;
            }
            System.out.println(string);
        }
    }
}
