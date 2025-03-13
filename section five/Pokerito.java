import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yourMatches = 0;
        int computerMatches =0;
        System.out.println("Let's play Pokerito. Type anything when you're ready"); 
        String text = scan.next(); 
        System.out.println("It's like Poker, but a lot simpler\n"); 
        System.out.println("There are two players, you and the computer.");
        System.out.println("The dealer will give each player one card."); 
        System.out.println("Then, the dealer will draw five cards (the river)"); 
        System.out.println("The player with tghe most river matches wins!"); 
        System.out.println("If the matches are equal, everyone's a winner!\n");  
        System.out.println("Ready? Type anything if you are");
        String ready = scan.next(); 
        int yourCard = selectRandomNumber(); 
        int dealersCard = selectRandomNumber(); 

        System.out.println("Here is your card " + yourCard + "\n" ); 
        System.out.println("Here is the computers card " + dealersCard + "\n" ); 
        System.out.println("Now, the dealer will draw five cards. Press enter to continue."); 
        scan.nextLine();
        scan.nextLine();

        for(int i=1; i<6; i++){
            System.out.println("Card " + i);
            int drawnCard =selectRandomNumber(); 
            if(drawnCard==yourCard){
                yourMatches++; 
            }
            if(drawnCard==dealersCard){
                computerMatches++; 
            }
            
            scan.nextLine();
        }
        
        System.out.println("\nYour number of matches: " + yourMatches);
        System.out.println("Computer's number of matches: " + computerMatches);

        if(yourMatches>computerMatches ){
            System.out.println("You win!"); 
        }else if(yourMatches==computerMatches){

            System.out.println("everyone wins!"); 
        }else{

            System.out.println("The computer wins!.");
        }
  
         scan.close();
    }

    public static int selectRandomNumber() {
    double randomNumber=Math.random()*13;
        randomNumber +=1; 
        int result =(int)randomNumber;
          
        
        switch ((int)randomNumber) {
            case 1: System.out.println( "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n");break; 
            case 2: System.out.println("   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n");break; 
            case 3: System.out.println("   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n");break; 
            case 4: System.out.println("   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n");break; 
            case 5: System.out.println("   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n");break; 
            case 6: System.out.println("   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n");break; 
            case 7: System.out.println( "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n");break; 
            case 8: System.out.println(
                "   _____ \n" +
                "  |8    |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  |____8|\n");break; 
            case 9: System.out.println("   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n");break; 
            case 10: System.out.println("   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n");break; 
            case 11: System.out.println("   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n");break; 
            case 12: System.out.println("   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n");break; 
            case 13: System.out.println("   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n");break; 
               
        
            default:
                break;
        }
return result; 
    }
    

}
