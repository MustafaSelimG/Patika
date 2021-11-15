import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Alışveriş tutarını giriniz : ");
        double tutar = scanner.nextDouble();

        if( 0.0 < tutar || tutar < 1000.0 ){
            tutar *= 1.18;
            System.out.println("KDV'li tutarınız : "+tutar);
        }

        else if( tutar >= 1000.0 ){
            tutar *= 1.08;
            System.out.println("KDV'li tutarınız : "+tutar);
        }
        else {
            System.out.println("Yanlış değer girdiniz");
        }

    }
}


/*
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18
Tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
