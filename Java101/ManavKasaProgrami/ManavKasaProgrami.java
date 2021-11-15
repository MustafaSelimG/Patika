import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args){

        double armut,elma,domates,muz,patlican,tutar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç kilo armut aldınız ? : ");
        armut = scanner.nextDouble();

        System.out.print("Kaç kilo elma aldınız ? : ");
        elma = scanner.nextDouble();

        System.out.print("Kaç kilo domates aldınız ? : ");
        domates = scanner.nextDouble();

        System.out.print("Kaç kilo muz aldınız ? : ");
        muz = scanner.nextDouble();

        System.out.print("Kaç kilo patlican aldınız ? : ");
        patlican = scanner.nextDouble();


        armut *= 2.14;
        elma *= 3.67;
        domates *= 1.11;
        muz *= 0.95;
        patlican *= 5.00;

        tutar = armut + elma + domates + muz + patlican;


        System.out.println("Toplam tutar : " + tutar + " TL");

    }
}

/*
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
