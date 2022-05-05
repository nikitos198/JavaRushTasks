package com.javarush.task.pro.task04.task0405;



public class Solution {
    public static void main(String[] args) {
        int hight = 1;
        while (hight <= 10){
            int width = 1;
            while (width <= 20){
                if (hight == 1 || hight == 10){
                    System.out.print("Б");
                } else if (width == 1 || width == 20) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                width++;
            }
            System.out.println();
            hight++;
        }

    }
}
