import java.util.Scanner;

public class DaireDilimi {

    public static void main(String[] args){

        double r,pi,a,alan;
        pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Daire Yarıçapını Giriniz : ");
        r = scanner.nextDouble();

        System.out.print("Daire Diliminin Açısını Giriniz : ");
        a = scanner.nextDouble();

        alan = ((pi * (r*r) * a) / 360 );

        System.out.println("Daire diliminin alanı : " + alan);

    }
}
