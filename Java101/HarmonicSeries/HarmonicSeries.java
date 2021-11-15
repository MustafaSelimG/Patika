package com.company;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total=0;

        System.out.print("Enter the number : ");
        double number = scanner.nextDouble();

        for (int i = 1; i <= number; i++) {
            total+= 1.0/i;
        }

        System.out.println("Harmonic Series Total : "+total);

    }
}
