package com.company;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=1,ebob=1;

        System.out.print("Enter the 1st Number : ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the 2nd Number : ");
        int n2 = scanner.nextInt();

        while (i != n1 ){
            if ( n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }

        int ekok = (n1 * n2)/ebob;

        System.out.println(n1 + " & "+n2 +" Ekok = "+ekok+" Ebob = "+ebob);
    }
}
