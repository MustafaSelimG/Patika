import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args){

        String kullaniciAdi,soru;
        int sifre,yenisifre;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adını Giriniz : ");
        kullaniciAdi = scanner.next();

        System.out.print("Şifrenizi Giriniz : ");
        sifre = scanner.nextInt();

        if( kullaniciAdi.equals("Mustafa") && sifre==1453 ){
            System.out.println("Giriş Yaptınız");
        }

        else if( kullaniciAdi.equals("Mustafa") && sifre!=1453){
            System.out.println("Şifreniz yanlış, yeni şifre oluşturmak ister misiniz? E/H");
            soru = scanner.next();

                if (soru.equals("E")){
                    System.out.println("Yeni şifre giriniz : ");
                    yenisifre = scanner.nextInt();

                     while ( yenisifre == 1453 ){
                             System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                             yenisifre = scanner.nextInt();
                     }

                    System.out.println("Şifreniz oluşturuldu : " + yenisifre);
                }

                else {
                    System.out.println("Giriş Yapılamadı");
                }

        }

        else {
            System.out.println("Giriş Yapılamadı");
        }

    }
}

