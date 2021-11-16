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
        System.out.println("\nWE ARE ALL SET,LET'S START !");

        String[][] array = new String[row][col];
        String[][] reveal = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                reveal[i][j]="-";
                array[i][j]="-";
            }
        }

        for (int i = 1; i <= (row*col)/4; i++) {
            int x = new Random().nextInt(row);
            int y = new Random().nextInt(col);

            if (!array[x][y].equals("*")){
                array[x][y]="*";
            }
            else if (array[x][y].equals("*")){
                i -= 1;
            }
        }

        System.out.println("MINE LOCATION\n");
        for (int k = 0; k < col; k++) {
            for (int l = 0; l < row; l++) {
                System.out.print(array[k][l]+" ");
            }
            System.out.println();
        }

        try {
            for (int i = 1; i <=((row*col)-(row*col)/4); i++) {
                System.out.print("Enter a row    → ");
                int a = scanner.nextInt();
                System.out.print("Enter a column → ");
                int b = scanner.nextInt();
                System.out.println();
                int mine=0;

                if ( array[a][b].equals("*")){
                    System.out.println("░░░░!!!GAME OVER!!!░░░░");
                    isWin=false;
                    break;
                }


                else if ( !array[a][b].equals("*")){

                    if(a>=1 && b>=1){
                        if (array[a-1][b-1].equals("*")){
                            mine++;
                        }
                    }

                    if(a>=1){
                        if (array[a-1][b].equals("*")){
                            mine++;
                        }
                    }

                    if(a>=1 && b+1<col){
                        if (array[a-1][b+1].equals("*")){
                            mine++;
                        }
                    }

                    if(b>=1){
                        if (array[a][b-1].equals("*")){
                            mine++;
                        }
                    }

                    if(b+1<col){
                        if (array[a][b+1].equals("*")){
                            mine++;
                        }
                    }

                    if(a+1<row && b>=1){
                        if (array[a+1][b-1].equals("*")){
                            mine++;
                        }
                    }

                    if(a+1<row){
                        if (array[a+1][b].equals("*")){
                            mine++;
                        }
                    }

                    if(a+1<row && b+1<col){
                        if (array[a+1][b+1].equals("*")){
                            mine++;
                        }
                    }

                    array[a][b]= Integer.toString(mine);
                    reveal[a][b]=array[a][b];

                }

                System.out.println(" ");
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
