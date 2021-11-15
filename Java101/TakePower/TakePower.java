package com.company;

import java.util.Scanner;

public class TakePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=1;

        System.out.print("Enter the number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the power : ");
        int num2 = scanner.nextInt();

        for (int i = 1; i <= num2 ; i++) {
            total*=num1;
        }
        System.out.println(num1 + "^"+num2+" = "+total);
    }
}
