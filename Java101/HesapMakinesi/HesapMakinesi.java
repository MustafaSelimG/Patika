import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args){

        double x,y;
        int islem;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        x = scanner.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        y = scanner.nextInt();

        System.out.print("1-Toplama  2-Çıkarma  3-Çarpma  4-Bölme : ");
        islem = scanner.nextInt();

        switch(islem)
        {
            case 1:
                System.out.println("İşleminizin sonucu : " + (x+y));
            break;

            case 2:
                System.out.println("İşleminizin sonucu : " + (x-y));
            break;

            case 3:
                System.out.println("İşleminizin sonucu : " + (x*y));
            break;

            case 4:
                System.out.println("İşleminizin sonucu : " + (x/y));
            break;

            default: System.out.println("Yanlış değer girdiniz");
        }
    }
}
