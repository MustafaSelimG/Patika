import java.util.Scanner;

public class NotOrtalaması {

    public static void main(String[] args) {

        int matematik,fizik,kimya,turkce,tarih,muzik,ortalama;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Sınav Puanın Nedir : ");
        matematik = scanner.nextInt();

        System.out.println("Fizik Sınav Puanın Nedir : ");
        fizik = scanner.nextInt();

        System.out.println("Kimya Sınav Puanın Nedir : ");
        kimya = scanner.nextInt();

        System.out.println("Türkçe Sınav Puanın Nedir : ");
        turkce = scanner.nextInt();

        System.out.println("Tarih Sınav Puanın Nedir : ");
        tarih = scanner.nextInt();

        System.out.println("Müzik Sınav Puanın Nedir : ");
        muzik = scanner.nextInt();

        ortalama = (matematik+fizik+kimya+turkce+tarih+muzik) / 6 ;
        System.out.println("Not ortalamanız : "+ortalama);
*
        if(ortalama >= 60){
            System.out.println("Sınıfı Geçti");
        }
        else if(ortalama < 60){
            System.out.println("Sınıfta Kaldı");
        }
        else{
            System.out.println("Yanlış bir değer girdiniz");
        }
    }

}

/*
Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
Kullanıcının ortalaması 60'dan büyük -ve eşitse- ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 */
