package com.company;

import java.util.Scanner;

public class RecursivePower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        System.out.print("Enter the power : ");
        int power = scanner.nextInt();

        System.out.println("Result = "+Exponentiation(number,power));

    }

    static int Exponentiation(int number,int power){
        if(power==1)return number;
        return Exponentiation(number,power-1)*number;
    }


}
