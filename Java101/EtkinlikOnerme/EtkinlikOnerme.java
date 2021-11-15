import java.util.Scanner;

public class EtkinlikOnerme {

    public static void main(String[] args){

        int sicaklik;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz : ");
        sicaklik = scanner.nextInt();
        System.out.println("Sıcaklık Değeri "+sicaklik+"°C");


        if( sicaklik < 5 ) {
            System.out.println("Kayak etkinliği yapabilirsiniz.");
        }

        else if(sicaklik >= 5 && sicaklik < 15){
            System.out.println("Sinema etkinliği yapabilirsiniz.");
        }

        else if(sicaklik >= 15 && sicaklik <= 25){
            System.out.println("Piknik etkinliği yapabilirsiniz.");
        }

        else if(sicaklik > 25){
            System.out.println("Yüzme etkinliği yapabilirsiniz.");
        }
        
        else {
            System.out.println("Yanlış değer girdiniz");
        }


    }
}
