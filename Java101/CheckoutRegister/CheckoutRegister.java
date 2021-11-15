import java.util.Scanner;

public class CheckoutRegister {

    public static void main(String[] args){

        double pear,apple,tomato,banana,eggplant,price;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many kilos of pear did you buy? : ");
        pear = scanner.nextDouble();

        System.out.print("How many kilos of apple did you buy? : ");
        apple = scanner.nextDouble();

        System.out.print("How many kilos of tomato did you buy? : ");
        tomato = scanner.nextDouble();

        System.out.print("How many kilos of banana did you buy? : ");
        banana = scanner.nextDouble();

        System.out.print("How many kilos of eggplant did you buy? : ");
        eggplant = scanner.nextDouble();


        pear *= 2.14;
        apple *= 3.67;
        tomato *= 1.11;
        banana *= 0.95;
        eggplant *= 5.00;

        price = pear + apple + tomato + banana + eggplant;


        System.out.println("Total price : " + price + " TL");

    }
}

