import java.util.Scanner;

public class ClassPassOrFail {

    public static void main(String[] args){

        double math,physics,turkish,chemistry,music,average;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Math Score : ");
        math = scanner.nextDouble();

        System.out.print("Physics Score : ");
        physics = scanner.nextDouble();

        System.out.print("Turkish Score : ");
        turkish = scanner.nextDouble();

        System.out.print("Chemistry Score : ");
        chemistry = scanner.nextDouble();

        System.out.print("Music Score : ");
        music = scanner.nextDouble();

        average = ((math + physics + turkish + chemistry + music ) / 5);

        if( average <= 100 && average >= 0){

            if (average >=55){
                System.out.println("Your average : "+average);
                System.out.println("You Passed the Class!");
            }
            else {
                System.out.println("Your average : "+average);
                System.out.println("You Didn't Pass the Class");
            }
        }

        else {
            System.out.println("You entered the wrong value");
        }


    }
}
