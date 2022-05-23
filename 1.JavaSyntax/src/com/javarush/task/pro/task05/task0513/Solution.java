package com.javarush.task.pro.task05.task0513;

import java.util.Arrays;

/* 
Выводим массивы
*/

public class Solution {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
//        for ( int i = 0; i < strings.length; i++){
////            System.out.print(strings[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < ints.length; i++){
//            System.out.print(ints[i] + " ");
//        }
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
