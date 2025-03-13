import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       int userGuess = scan.nextInt();
       int secret = 4; 
       
       while (userGuess!=secret) {
        System.out.print("Guess Again ");
        userGuess = scan.nextInt();
       }
       

       
       
       //See Learn the Part for detailed instructions.
        
        scan.close();
    }
    
}
