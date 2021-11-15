import java.util.Scanner;

public class SinifiGecmeDurumu {

    public static void main(String[] args){

        double Matematik, Fizik, Turkce, Kimya, Muzik,Ortalama;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        Matematik = scanner.nextDouble();

        System.out.print("Fizik Notunuzu Giriniz : ");
        Fizik = scanner.nextDouble();

        System.out.print("Turkce Notunuzu Giriniz : ");
        Turkce = scanner.nextDouble();

        System.out.print("Kimya Notunuzu Giriniz : ");
        Kimya = scanner.nextDouble();

        System.out.print("Muzik Notunuzu Giriniz : ");
        Muzik = scanner.nextDouble();

        Ortalama = ((Matematik + Fizik + Turkce + Kimya + Muzik ) / 5);

        if( Ortalama <= 100 && Ortalama >= 0){

            if (Ortalama >=55){
                System.out.println("Ortalamanız : "+Ortalama);
                System.out.println("Sınıfı Geçtiniz!");
            }
            else {
                System.out.println("Ortalamanız : "+Ortalama);
                System.out.println("Sınıfı Geçemediniz");
            }
        }

        else {
            System.out.println("Yanlış değer girdiniz");
        }


    }
}
