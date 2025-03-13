import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int rollOne = rollDice(); 
        int rollTwo = rollDice(); 
        int rollThree = rollDice(); 
        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scanner.nextInt(); 
        int num2 = scanner.nextInt(); 
        int num3 = scanner.nextInt(); 
        int sumOfNumbers = num1+num2+num3; 
        int sumOfDiceRolls = rollOne+rollTwo+rollThree; 

System.out.println("Your Sum: " + sumOfNumbers + "Dice Sum: " + sumOfDiceRolls );

       if(islessthan1(num1, num2, num3) || (isBiggerThan6(num1, num2, num3))){
        System.out.println("You entered bad numbers"); 
        System.exit(0);
       }

       if(userWon(sumOfNumbers, sumOfDiceRolls)){

        System.out.println("\nNice work you won"); 
       }else {

        System.out.println("\nBetter luck next time");
       }
       
        




scanner.close();  

    }

    public static boolean islessthan1(int num1, int num2, int num3){

        return (num1 <1 || num2 <1 || num3 <1); 


    }

    public static boolean isBiggerThan6(int num1, int num2, int num3){

        return (num1 >6 || num2 >6 || num3 >6); 


    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls){

       return (sumNumbers>sumDiceRolls && (sumNumbers-sumDiceRolls)<5) ;


    }

    public static int rollDice() {

        double randomNumber=Math.random()*6; 
        randomNumber+=1; 
        return (int) randomNumber;

    }
    
}
