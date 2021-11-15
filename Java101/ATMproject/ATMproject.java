package com.company;

import java.util.Scanner;

public class ATMproject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3,balance = 2000,option=0,action=0;


        do {
            System.out.print("Username : ");
            String userName = scanner.next();

            System.out.print("Password : ");
            String password = scanner.next();

            switch ( userName ){
                case "admin":
                    switch ( password ){
                        case "1234":
                            System.out.println("\n *** Welcome the Bank *** \n");
                            do {
                                count=0;
                                System.out.println("1-Deposit    2-Withdrawal\n" +
                                        "3-Question Balance    4-Check Out");
                                System.out.print("Please select the action you want to do : ");
                                option = scanner.nextInt();
                                System.out.println();
                                switch (option){
                                    case 1:
                                        System.out.print("Amount of money : ");
                                        action = scanner.nextInt();
                                        balance += action;
                                        break;
                                    case 2:
                                        System.out.print("Amount of money : ");
                                        action = scanner.nextInt();
                                        if (balance > action) balance -= action;
                                        if (action > balance) System.out.println("Not enough money in your balance");
                                        break;
                                    case 3:
                                        System.out.println("Your total is : "+balance);
                                        break;
                                    case 4:
                                        System.out.println("Have a nice day");
                                        break;
                                    default:
                                        System.out.println("Wrong Option!");
                                        break;
                            }

                            }while (option != 4);
                            break;
                        default:
                            System.out.println("Wrong Password!");
                            count--;
                            break;
                    }
                    break;
                default:
                    System.out.println("Wrong Username!");
                    count--;
                    break;
            }
        }while (count>0);



    }
}
