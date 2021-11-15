package com.company;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int high=Integer.MIN_VALUE,low=Integer.MAX_VALUE;
        System.out.print("How many numbers will you enter : ");
        int quantity = scanner.nextInt();


        for (int i = 1; i <= quantity; i++) {
            System.out.print("Enter the "+ i +". number : ");
            int number = scanner.nextInt();

            if (number > high) high = number;
            if (low > number) low = number;
        }

        System.out.println("Highest number : "+high);
        System.out.println("Lowest number : "+low);
    }
}
