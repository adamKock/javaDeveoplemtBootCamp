import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rock = 0;
        int scissors = 1;
        int paper = 2;
        
        System.out.println("Let's play Rock Paper Scissors. When I say shoot, choose rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are."); 
        String yesOrNo = scanner.nextLine();

        if(yesOrNo.equalsIgnoreCase("yes")){
            System.out.println("Great! Rock, paper, scissors, shoot!");
            String usersChoice = scanner.nextLine();
            // Now you can compare the user's choice with the computer's choice and determine the winner.
        } else {
            System.out.println("Darn, some other time...!");
        }
    }

    public static int computerChoice() {
        double randomNumber = Math.random() * 3; 
        int choice = (int)randomNumber; 

        if(choice == 0){
            return 0; // rock
        } else if (choice == 1) {
            return 1; // scissors
        } else {
            return 2; // paper
        }
    }
}
