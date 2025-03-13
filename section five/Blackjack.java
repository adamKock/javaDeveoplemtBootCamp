import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");

        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine(); 
        int card1 = drawRandomCard();
        int card2 = drawRandomCard(); 
        String userRandomCard1= cardString(card1);
        String userRandomCard2= cardString(card2);
        System.out.println("\n You get a \n" + userRandomCard1 + "\n and a \n" + userRandomCard2); 
        int total =Math.min(card1, 10) + (Math.min(card2, 10)); 
        int handValue = Math.min(card1, 10) + (Math.min(card2, 10));  
        System.out.println(" Your total is " + total);
        int card3= drawRandomCard(); 
        int card4= drawRandomCard(); 
        String dealerCard1= cardString(card3); 
        String dealerCard2= cardString(card4);
        System.out.println("The dealer shows \n" + dealerCard1 + "\nand has a card facing down \n" + faceDown()); 
        int dealerValue = Math.min(card3, 10) + (Math.min(card4, 10)); 
       
       while(true){ //While loop that loops through each time user hits. It will come out the loop as soon as they hit stay
        String userChoice=hitOrStay(); // calliing the hit or stay function and putting it into a string called user choice
        if(userChoice.equals("hit")){
            int card = drawRandomCard();
            String userRandomCard3= cardString(card); 
            handValue+= Math.min(card,10);
            System.out.println("\n You get a \n" + userRandomCard3); 
            System.out.println("your new total is " + handValue); 
            if(handValue>21){
                System.out.println("Bust! Player loses"); 
                System.exit(0); 
            }
        }else if(userChoice.equals("stay")){ //else if statement to say if the user clicks stay then it;s the dealers turn
            System.out.println("\nDealers Turn"); 
            System.out.println("\nDealers Cards are \n" + dealerCard1 + "\nand a\n" + dealerCard2 ); 
            System.out.println("Dealers Value is " + dealerValue); 
            

                while(dealerValue<17){//while loop as dealer needs to hit until they are higher than 17 or bust 
                int card5 = drawRandomCard();
                String userRandomCard4= cardString(card5);
                dealerCard2 = userRandomCard4;
                dealerValue += Math.min(card5, 10); 
                System.out.println("\n Dealer gets a \n" + userRandomCard4); 
                System.out.println("Dealers new total is " + dealerValue);
                
            }
            if(dealerValue>21){// if conditions to find out who wins 
                System.out.println("Bust! Dealer loses"); 
                System.exit(0);}
                else if (dealerValue<handValue){
                    System.out.println("Player Wins"); 
                }else if (dealerValue==handValue){
                    System.out.println("Draw Money Back");  
                }else{
                    System.out.println("Dealer Wins"); 
                }
            break; 
        }
        
    }
    scan.close();
       }
      
        
      
        
     

        

       
        
        

    
    public static int drawRandomCard() {
        double randomNumber=Math.random()*13;
            randomNumber +=1; 
            int cardNumber =(int)randomNumber;
            return cardNumber; }
    
    public static String cardString (int cardNumber){
        switch (cardNumber){
          case 1: return "   _____\n"+
          "  |A _  |\n"+ 
          "  | ( ) |\n"+
          "  |(_'_)|\n"+
          "  |  |  |\n"+
          "  |____V|\n"; 
          case 2: return "   _____\n"+              
          "  |2    |\n"+ 
          "  |  o  |\n"+
          "  |     |\n"+
          "  |  o  |\n"+
          "  |____Z|\n";
          case 3: return "   _____\n" +
          "  |3    |\n"+
          "  | o o |\n"+

          "  |     |\n"+
          "  |  o  |\n"+
          "  |____E|\n";
          case 4: return "   _____\n" +
          "  |4    |\n"+
          "  | o o |\n"+
          "  |     |\n"+
          "  | o o |\n"+
          "  |____h|\n";
          case 5: return "   _____ \n" +
          "  |5    |\n" +
          "  | o o |\n" +
          "  |  o  |\n" +
          "  | o o |\n" +
          "  |____S|\n";
          case 6: return "   _____ \n" +
          "  |6    |\n" +
          "  | o o |\n" +
          "  | o o |\n" +
          "  | o o |\n" +
          "  |____6|\n";
          case 7: return  "   _____ \n" +
          "  |7    |\n" +
          "  | o o |\n" +
          "  |o o o|\n" +
          "  | o o |\n" +
          "  |____7|\n";
          case 8: return  "   _____ \n" +
          "  |8    |\n" +
          "  |o o o|\n" +
          "  | o o |\n" +
          "  |o o o|\n" +
          "  |____8|\n";
          case 9: return "   _____ \n" +
          "  |9    |\n" +
          "  |o o o|\n" +
          "  |o o o|\n" +
          "  |o o o|\n" +
          "  |____9|\n";
          case 10: return "   _____ \n" +
          "  |10  o|\n" +
          "  |o o o|\n" +
          "  |o o o|\n" +
          "  |o o o|\n" +
          "  |___10|\n";
          case 11: return "   _____\n" +
          "  |J  ww|\n"+ 
          "  | o {)|\n"+ 
          "  |o o% |\n"+ 
          "  | | % |\n"+ 
          "  |__%%[|\n";
          case 12: return 
          "   _____\n" +
          "  |Q  ww|\n"+ 
          "  | o {(|\n"+ 
          "  |o o%%|\n"+ 
          "  | |%%%|\n"+ 
          "  |_%%%O|\n";
          case 13: return "   _____\n" +
          "  |K  WW|\n"+ 
          "  | o {)|\n"+ 
          "  |o o%%|\n"+ 
          "  | |%%%|\n"+ 
          "  |_%%%>|\n";
          default: return "Card not found";
        } 
        }
  


    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }

    public static String hitOrStay(){
        System.out.println("Do you want to hit or stay "); 
        String userChoice = scan.next();
        if (!userChoice.equals("hit") && !userChoice.equals("stay")) {
            System.out.println("Please write hit or stay "); 
            return hitOrStay(); 
        }
        return userChoice; 
        
    }
    
    
    }

