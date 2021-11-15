import java.util.Scanner;

public class IndeksHesaplama {

    public static void main(String[] args){

        double boy,kilo,indeks;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();

        indeks = ( kilo / (boy*boy));

        System.out.println("Vücut Kitle İndeks : " + indeks);

    }
}
