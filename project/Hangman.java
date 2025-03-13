import java.util.Scanner;

public class Hangman {
    static Scanner scan = new Scanner(System.in); 

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

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
        char[] charCompWord=computersWord.toCharArray();
        char[] userGuesses= new char[10];
        char[] wrongGuesses= new char[10];
        char[] correctGuesses=new char[10]; 
        int wrongGuessIndex = 0;
        int correctGuessIndex = 0;
        
        int incorrectGuesses=0;  
        boolean wordGuessed=false; 

        //need to make a loop that keeps running until either hangman is dead or user has guessed correct 
       
        while(incorrectGuesses<gallows.length &&!wordGuessed){
            System.out.print("\n "+ gallows[incorrectGuesses]);
            //printPlaceholders(computersWord);
            System.out.print("\n Word " );
            printPlaceholders(computersWord);
            System.out.print("\n Misses " );
            for(int i=0; i<wrongGuesses.length; i++){
            System.out.print(" " + wrongGuesses[i]);
            }
           
            System.out.print("\n Enter your guess: ");
            char userGuess = scan.next().charAt(0);
           
        
            int matches = checkGuess(charCompWord, userGuess,userGuesses, wrongGuesses, wrongGuessIndex, correctGuesses, correctGuessIndex);
            if(matches>0){
            System.out.println("Correct Guess");
            correctGuessIndex++; 
            updatePlaceholders(computersWord,correctGuesses); 
            
            }else{
                incorrectGuesses++; 
                System.out.println("Incorrect Guess");
                wrongGuessIndex++;
                
                
            }

           

            
            
            
            
        }
            
        

        }
        
                
   

   



    public static int randomWord(){
        double randomNumber=Math.random()*64; 
        randomNumber+=1;
        int number= (int)randomNumber; 
        return number; 

    }
    public static char[] printPlaceholders(String computersWord){
        int placeHolderCharAmount = computersWord.length();
        char[] underScores = new char[placeHolderCharAmount]; 
        //System.out.print(" Word :");
        for(int i=0;  i<computersWord.length(); i++){
            underScores[i]='_';
            System.out.print(underScores[i] + " ");
        }return underScores;
       

}

public static void updatePlaceholders(String computersWord, char[] currentGuess){
    int placeHolderCharAmount = computersWord.length();
    char[] underScores = new char[placeHolderCharAmount];
    System.out.print("Word :");
    for(int i=0; i<computersWord.length(); i++){
        char currentChar= currentGuess[i]; 
        if (currentGuess[i]==currentChar){
           System.out.print(currentChar);
        }else{

            System.out.println(" -");
        }
        
    }

    // in this function we want to take the correct guess and update it on the placeholders where it matches 
    //most likely need to match the guess to the index that it is found at then update it at that index
}

    public static int checkGuess(char []charCompWord,  char usersGuess, char[]currentGuess, char[]wrongGuesses, int wrongGuessIndex, char[]correctGuesses, int correctGuessIndex){ 
         // in this section I am trying to check the guess and then if it is correct return a value that that enables me to print the correct gallows
         //if it is incorrect then I want it to return a value so I can update and print the right gallows 
         int matchCount =0; 
         
         for(int i=0; i<charCompWord.length; i++){
           if(charCompWord[i]==usersGuess){
            currentGuess[i]=usersGuess;
            correctGuesses[correctGuessIndex]=usersGuess; 
            matchCount++;
           }if(matchCount==0){
            wrongGuesses[wrongGuessIndex] = usersGuess;
           }
           }
           
        return matchCount; 
}     

        
}
        
        
    









