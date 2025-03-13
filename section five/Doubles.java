public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.
       
        int dice1;
        int dice2;
        dice1= rollDice();
        dice2= rollDice();
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");

while(dice1!=dice2){
        dice1= rollDice();
        dice2= rollDice();
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");
}


    }

    public static int rollDice() {
        double randomNumber=Math.random()*6;
        randomNumber +=1; 
        return (int) randomNumber; 
    
    }

}





