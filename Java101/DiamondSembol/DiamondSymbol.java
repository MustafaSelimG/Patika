package com.company;

import java.util.Scanner;

public class DiamondSembol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number : ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int x = 0; x <= n; x++) {
            for (int y = 0; y < x+1; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2*n-2*x)-1; z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
