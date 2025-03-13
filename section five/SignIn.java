import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Adam";
        String password = "123";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String inputUsername = scan.next(); 
        //pick up username
        System.out.print("- Password: ");
        //pick up passwordA
        String inputPassword = scan.next();
        


        while(!inputUsername.equals(username) || !inputPassword.equals(password)){
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            inputUsername = scan.next();
            System.out.print("- Password: ");
            inputPassword = scan.next();

        }System.out.println("Sign in successful. Welcome!");

        
        scan.close();
        
    }
}
