package com.company;

import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {
        int n,r;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the n : ");
        n = scanner.nextInt();

        System.out.print("Enter the r : ");
        r = scanner.nextInt();

        System.out.println("Combination Equalts to = "+Combination(n,r));

    }

    public static int Combination(int n,int r){
        return Factorial(n) / ( Factorial(r) * Factorial(n-r));
    }

    public static int Factorial(int n){
    int factorial=1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
