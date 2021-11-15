import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args){

        double u,result;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the length of side A : ");
        double a = scanner.nextDouble();
        System.out.print("Enter the length of side B : ");
        double b = scanner.nextDouble();
        System.out.print("Enter the length of side C : ");
        double c = scanner.nextDouble();

        u = ((a + b + c) / 2.0);

        result = Math.sqrt((u * (u-a)* (u-b) * (u-c)));

        System.out.println("The area of the triangle you entered : "+result);
    }
}

