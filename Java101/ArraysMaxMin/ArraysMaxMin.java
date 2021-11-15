package com.company;

import java.util.Scanner;

public class ArraysMaxMin {
    public static void main(String[] args) {
        int[] list = {123, 52, 35, 61, 211, 41, 79};
        int plus=Integer.MAX_VALUE,minus=Integer.MIN_VALUE,temp;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int input = scanner.nextInt();

        for (int i : list) {
            temp = i-input;
            if (plus > i && temp > 0) {
                plus = i;
            }
        }

        for (int i : list) {
            temp = input - i;
            if (minus < i && temp > 0 ) {
                minus = i;
            }
        }

        System.out.println("Nearest number smaller than the entered number : "+ minus);
        System.out.println("Nearest number greater than the entered number: " + plus);
    }
}