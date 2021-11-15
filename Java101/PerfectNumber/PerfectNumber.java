package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if ( number % i == 0) total+=i;
        }

        if (total == number) System.out.println("It's a Perfect Number!");
        else System.out.println("Not a Perfect Number.");
    }
}
