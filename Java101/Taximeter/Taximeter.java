import java.util.Scanner;

public class Taximeter {

    public static void main(String[] args){

        double price;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the KM value : ");
        double km = scanner.nextDouble();


        price = 10 + (km * 2.20);

        if(price <= 20){
            System.out.println("The price you have to pay is 20 TL.");
        }
        else{
            System.out.println("The price you have to pay: " + price );
        }

    }
}

