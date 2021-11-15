package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RankingNumbers {

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);
        int a,b,c;

        try{

            System.out.print("Enter the first number : ");
            a = scanner.nextInt();

            System.out.print("Enter the first number : ");
            b = scanner.nextInt();

            System.out.print("Enter the third number : ");
            c = scanner.nextInt();

            if ( a < b && a < c ){
                if ( b > c ){
                    System.out.println(" a < b < c ");
                }
                if ( c > b ){
                    System.out.println(" a < c < b ");
                }
            }

            if ( b > c && b > a ){
                if ( a > c ){
                    System.out.println(" b < a < c ");
                }
                if ( c > a ){
                    System.out.println(" b < c < a ");
                }
            }

            if ( c > b && c > a ){
                if ( b > a ){
                    System.out.println(" c < b < a ");
                }
                if ( a > b ){
                    System.out.println(" c < a < b ");
                }
            }

        }catch (InputMismatchException e){
            System.out.println(" WRONG INPUT ");
        }


    }
}
