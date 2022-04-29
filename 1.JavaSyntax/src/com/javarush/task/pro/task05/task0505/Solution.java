package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberN = console.nextInt();
        int[] array = new int[numberN];
        if (numberN > 0){
            for (int i = 0; i < numberN; i++){
                array[i] = console.nextInt();
            }
        }
        if (numberN % 2 != 0){
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i] + " ");
            }
        }else{
            for (int i = array.length - 1; i >= 0; i--){
                System.out.println(array[i] + " ");
            }
        }
    }
}
