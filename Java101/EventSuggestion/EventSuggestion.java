import java.util.Scanner;

public class EventSuggestion {

    public static void main(String[] args){

        int degree;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Temperature Value : ");
        degree = scanner.nextInt();
        System.out.println("Temperature Value is "+degree+"°C");

        if( degree < 5 ) {
            System.out.println("You can do ski activity.");
        }

        else if(degree >= 5 && degree < 15){
            System.out.println("You can make a movie event.");
        }

        else if(degree >= 15 && degree <= 25){
            System.out.println("You can have a picnic.");
        }

        else if(degree > 25){
            System.out.println("You can swim.");
        }

        else {
            System.out.println("You entered wrong value");
        }

    }
}
