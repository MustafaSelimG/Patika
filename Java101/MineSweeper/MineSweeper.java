package com.company;

import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    public static void main(String[] args) {
        boolean isWin=true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mine Sweeper © !");
        System.out.print("Enter the array rows → ");
        int row = scanner.nextInt();
        System.out.print("Enter the array columns → ");
        int col = scanner.nextInt();
        System.out.println("WE ARE ALL SET,LET'S START !");

        String[][] array = new String[row][col];
        String[][] reveal = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                reveal[i][j]="-";
                array[i][j]="-";
            }
        }

        for (int i = 0; i < (row*col)/4; i++) {
            int x = new Random().nextInt(row);
            int y = new Random().nextInt(col);

            if (!array[x][y].equals("*")){
                array[x][y]="*";
            }
            else if (array[x][y].equals("*")){
                i -= 1;
            }
        }

        try {
            for (int i = 0; i < (row*col); i++) {
                System.out.print("\nEnter a row    → ");
                int a = scanner.nextInt();
                System.out.print("Enter a column → ");
                int b = scanner.nextInt();
                System.out.println();

                if ( array[a][b].equals("*")){
                    System.out.println("░░░░!!!GAME OVER!!!░░░░");
                    isWin=false;
                    break;
                }


                else if ( !array[a][b].equals("*")){

                    array[a][b]= Integer.toString(row/2);
                    reveal[a][b]=array[a][b];

                }


                for (int k = 0; k < col; k++) {
                    for (int l = 0; l < row; l++) {
                        System.out.print(reveal[k][l]+" ");
                    }
                    System.out.println();
                }

                System.out.println("\n♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦\n");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            isWin=false;
            System.out.println(e.getMessage() + " / Wrong Value Entered..");
        }


        if (isWin){
            System.out.println("CONGRATULATIONS, YOU WON!♪");
        }

    }
}
