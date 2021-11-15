import java.util.Scanner;

public class BodyIndex {

    public static void main(String[] args){

        double height,weight,index;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        height = scanner.nextDouble();

        System.out.print("Please enter your weight: ");
        weight = scanner.nextDouble();

        index = ( weight / (height*height));

        System.out.println("Body Mass Index : " + index);
    }
}
