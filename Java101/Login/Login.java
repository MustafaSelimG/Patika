import java.util.Scanner;

public class Login {

    public static void main(String[] args){

        String username,isNewPassword;
        int password,newPassword;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username : ");
        username = scanner.next();

        System.out.print("Enter Your Password : ");
        password = scanner.nextInt();

        if( username.equals("Mustafa") && password==1453 ){
            System.out.println("You are logged in");
        }

        else if( username.equals("Mustafa") && password!=1453){
            System.out.println("Your password is incorrect, do you want to create a new password? Y/N");
            isNewPassword = scanner.next();

                if (isNewPassword.equals("Y")){
                    System.out.println("Enter new password : ");
                    newPassword = scanner.nextInt();

                     while ( newPassword == 1453 ){
                             System.out.println("Could not create a password, please enter another password : ");
                             newPassword = scanner.nextInt();
                     }

                    System.out.println("Your password has been created : " + newPassword);
                }

                else {
                    System.out.println("Giriş Yapılamadı");
                }

        }

        else {
            System.out.println("Giriş Yapılamadı");
        }

    }
}

