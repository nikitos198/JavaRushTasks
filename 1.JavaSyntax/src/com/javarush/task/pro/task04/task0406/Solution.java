package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String a = console.nextLine();
            if (a.equals("enough")){
                break;
            }
            System.out.println(a);
        }
    }
}
