import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors. When I say shoot, choose rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are."); 
        String yesOrNo = scanner.next();

        if(yesOrNo.equalsIgnoreCase("yes")) {
            System.out.println("Great! Rock, paper, scissors, shoot!");
            String usersChoice = scanner.next();
            String compChoice = computerChoice(); 
            String finalResult = result(usersChoice, compChoice);
            printResult(usersChoice, compChoice, finalResult);
        } else {
            System.out.println("Darn, some other time...!");
        }
    }

    public static String computerChoice() {
        double randomNumber = Math.random() * 3; 
        int choice = (int) randomNumber; 

        if(choice == 0) {
            return "Rock"; 
        } else if (choice == 1) {
            return "Paper"; 
        } else {
            return "Scissors";
        }
    }

    public static String result(String usersChoice, String compChoice) { 
        if(usersChoice.equalsIgnoreCase("rock") && compChoice.equalsIgnoreCase("scissors")) {
            return "Great you win";
        } else if (usersChoice.equalsIgnoreCase("paper") && compChoice.equalsIgnoreCase("rock")) {
            return "Great you win";
        } else if(usersChoice.equalsIgnoreCase("scissors") && compChoice.equalsIgnoreCase("paper")) {
            return "Great you win";
        } else if(compChoice.equalsIgnoreCase("rock") && usersChoice.equalsIgnoreCase("scissors")) {
            return "Computer Wins";
        } else if (compChoice.equalsIgnoreCase("paper") && usersChoice.equalsIgnoreCase("rock")) {
            return "Computer Wins";
        } else if(compChoice.equalsIgnoreCase("scissors") && usersChoice.equalsIgnoreCase("paper")) {
            return "Computer Wins";
        } else if(usersChoice.equalsIgnoreCase(compChoice)) {
            return "It's a tie";
        } else {
            return "Invalid Choice";
        }
    }

    public static void printResult(String yourchoice, String computerChoice, String result) {
        System.out.println("Your choice was " + yourchoice);
        System.out.println("Computer Choice was " + computerChoice);
        System.out.println("The Result was " + result);
    }
}
