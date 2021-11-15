package com.company;

public class Main {

        public static void main(String[] args) {

            Fighter onur = new Fighter("Onur" , 35 , 144, 91, 5);
            Fighter selim = new Fighter("Selim" , 36 , 145, 92, 4);
            Ring r = new Ring(onur,selim , 90 , 100);
            r.run();

        }
}
