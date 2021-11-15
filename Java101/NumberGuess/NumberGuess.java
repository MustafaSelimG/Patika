package com.company;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        int count=0,guess;
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100);

        while (count!=5){
            System.out.print("Guess the Number : ");
            guess = scanner.nextInt();

            if ( guess == number ){
                System.out.println("Congratulations!! Your guess is right.");
                break;
            }
            else if ( guess > number ){
                System.out.println("Number is Lower then your Guess!");
            }
            else if ( guess < number ){
                System.out.println("Number is Higher then your Guess!");
            }

            else {
                System.out.println("Wrong Guess! The Number is between 0-100");
            }
            count++;
        }

        if ( count == 5){
            System.out.println("Out of Guesses. You didn't find the number.");
        }
    }
}