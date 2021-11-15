    package com.company;

    import java.util.Scanner;

    public class Prime {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a Number : ");
            int number = scanner.nextInt();

            if (PrimeNumber(number)==false){
                System.out.println("Prime number");
            }
            else if (PrimeNumber(number)==true){
                System.out.println("Not a Prime number");
            }

        }



        static boolean PrimeNumber(int number) {

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return true;
                }
            }
            return false;
        }

    }
