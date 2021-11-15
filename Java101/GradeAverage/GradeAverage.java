import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {

        int math,physics,chemistry,turkish,history,music,average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your math exam Score? : ");
        math = scanner.nextInt();

        System.out.println("What is your physics exam Score? : ");
        physics = scanner.nextInt();

        System.out.println("What is your chemistry exam Score? : ");
        chemistry = scanner.nextInt();

        System.out.println("What is your turkish exam Score? : ");
        turkish = scanner.nextInt();

        System.out.println("What is your history exam Score? : ");
        history = scanner.nextInt();

        System.out.println("What is your music exam Score? : ");
        music = scanner.nextInt();

        average = (math+physics+chemistry+turkish+history+music) / 6 ;
        System.out.println("Grade average is : "+average);
*
        if(average >= 60){
            System.out.println("Passed the Class");
        }
        else if(average < 60){
            System.out.println("Class failed");
        }
        else{
            System.out.println("You entered an incorrect value");
        }
    }

}

/*
math, physics, chemistry, Türkçe, history, Müzik
Kullanıcının averagesı 60'dan büyük -ve eşitse- ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 */
