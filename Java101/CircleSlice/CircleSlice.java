import java.util.Scanner;

public class CircleSlice {

    public static void main(String[] args){

        double r,pi,a,area;
        pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Circle Radius: ");
        r = scanner.nextDouble();

        System.out.print("Enter the Angle of the Circle Slice : ");
        a = scanner.nextDouble();

        area = ((pi * (r*r) * a) / 360 );

        System.out.println("Area of the Circle Slice : " + area);

    }
}
