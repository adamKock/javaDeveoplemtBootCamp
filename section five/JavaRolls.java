import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        
        int diceRoll;
        int score = 0;
        System.out.println("Let's play Rolling Java. Type anything to start."); 
        String text = scan.next();
        System.out.println(" - Great, here are the rules:\n");
        System.out.println(" - If you roll a 6, the game stops");
        System.out.println(" - If you roll a 4, nothing happens.");
        System.out.println(" - Otherwise, you get 1 point.\n");
        System.out.println(" You must collect at least 3 points to win. Enter anything to roll:");
        String enterText = scan.next();
         
        while(true){
            diceRoll = rollDice();
            
            if(diceRoll==6){
                System.out.println("You Rolled a " + diceRoll + " .End of game." ); 
                break; 
            }else if(diceRoll==4){
                System.out.println("You Rolled a " + diceRoll + " .Zero Points. "  ); 
            }else{
                System.out.println("You Rolled a " + diceRoll + " .One point. Keep rolling.");  
                score+=1; 
            }
            
        }if(score>= 3){
            System.out.println("Your Score is " + score);
            System.out.println("Wow, that's lucky. You win!"); 
        }else{
            System.out.println("Your Score is " + score);
            System.out.println("Tough luck, you lose :(");   
        }

      
        

    }
  
    public static int rollDice() {
        double randomNumber=Math.random()*6;
        randomNumber +=1; 
        return (int) randomNumber; 
    
    }

  
  
}
