import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args){

        double x,y;
        int operation;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value : ");
        x = scanner.nextInt();

        System.out.print("Enter the second value : ");
        y = scanner.nextInt();

        System.out.print("1-Addition 2-Subtraction 3-Multiplication 4-Division: ");
        operation = scanner.nextInt();

        switch(operation)
        {
            case 1:
                System.out.println("The result is : " + (x+y));
            break;

            case 2:
                System.out.println("The result is : " + (x-y));
            break;

            case 3:
                System.out.println("The result is : " + (x*y));
            break;

            case 4:
                System.out.println("The result is : " + (x/y));
            break;

            default: System.out.println("Wrong value");
        }
    }
}
