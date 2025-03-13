import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {

        System.out.println("Welcome to Big Kock Grocer"); 
        System.out.println("What can I help you find"); 
        Scanner scan = new Scanner(System.in);
        String usersNeed = scan.next(); 
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.3).
        String [] aisle = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        
      

        for(int i=0; i<aisle.length; i++){
            if(aisle[i].equals(usersNeed)){
                System.out.println("\nWe have that in aisle: " + i );

            }
        }
        
        
    
    }
}
