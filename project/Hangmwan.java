import java.util.Scanner;

public class Hangmwan {
    static Scanner scan = new Scanner(System.in); 

    public static String[] words = {"baboon", "banana"}; 

    public static String[] gallows = {
    "+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        String computersWord = words[randomWord()];
        System.out.println(computersWord);
        char[] placeholders = initializePlaceholders(computersWord.length());
        char[] charCompWord=computersWord.toCharArray();
        char[] wrongGuesses= new char[10];
        int incorrectGuesses=0;  
        boolean wordGuessed=false; 
        int compWordInt =computersWord.length(); 
        int overallMatchCount=0; 

        //need to make a loop that keeps running until either hangman is dead or user has guessed correct 
       
        while(incorrectGuesses<gallows.length &&!wordGuessed){
            System.out.print("\n "+ gallows[incorrectGuesses]);
            System.out.print("\n Word " );
            printPlaceholders(placeholders); 
            System.out.print("\n Misses " );
            for(int i=0; i<wrongGuesses.length; i++){
                System.out.print(" " + wrongGuesses[i]);
            }
            System.out.print("\n Enter your guess: ");            
            char userGuess = scan.next().charAt(0); 
            // now we want to take the users guess and then insert it into a check guess function that loops through all the chars to see if there is a match 
           int[] matches= checkSingleGuess(userGuess, charCompWord); 
           int matchCount=matches[0]; 
           if(matchCount>0){ 
            updatePlaceholders(placeholders, userGuess, computersWord);
            overallMatchCount+=1; 
            if(overallMatchCount==compWordInt){
                updatePlaceholders(placeholders, userGuess, computersWord);
                System.out.print("You Win word was "); 
                printPlaceholders(placeholders);
                break; 
            }
           }else{
            incorrectGuesses++;
            updateMisses(wrongGuesses,userGuess); 
            if(incorrectGuesses>5){
                System.err.println("Game Over ");
                System.out.println("The Word was " + computersWord);
                break; 
            }
            
           }
                      
            
        }
            
        
scan.close();
        }

    public static int randomWord(){
        double randomNumber=Math.random(); 
        randomNumber+=1;
        int number= (int)randomNumber; 
        return number; 

    }

    public static char[] initializePlaceholders(int length) {
        char[] underScores = new char[length];
        for(int i = 0; i < length; i++) {
            underScores[i] = '_';
        }
        return underScores;
    }

    public static void printPlaceholders(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
            char c = placeholders[i];
            System.out.print(c + " ");
        }
        System.out.println(); 
       
    }


public static void updatePlaceholders(char[] placeholders, char userGuess, String computersWord) {
    for(int i=0; i<placeholders.length; i++){
        if(computersWord.charAt(i)==userGuess){
            placeholders[i]=userGuess; 
        }
    }
    
    }

public static int[] checkSingleGuess(char usersGuess, char[] charCompWord){
    int matchCount =0; 
    int indexOfCharFound =-1; 
    for(int i=0; i<charCompWord.length; i++){
        if(charCompWord[i]==usersGuess){
            matchCount++; 
            indexOfCharFound = i;     
        }
        
        }
return  new int [] {matchCount, indexOfCharFound }; 
}

      
public static void updateMisses(char[] wrongGuesses, char userGuess) {
    for(int i=0; i<wrongGuesses.length; i++){
        if(wrongGuesses[i]==0){
            wrongGuesses[i]=userGuess;
            break;  
        }
    }
    
}
        
}
        
        
    









