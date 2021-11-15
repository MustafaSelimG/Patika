package com.company;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;

        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        char[] array = String.valueOf(number).toCharArray();

        for (int i = 0; i < array.length; i++) {
            total+=Character.getNumericValue(array[i]);
        }

        System.out.println("Sum of the Digits : "+total);

    }
}
