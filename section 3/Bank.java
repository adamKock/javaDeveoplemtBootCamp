import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String mortgageService = scan.next();
        if(mortgageService.equals("yes")){
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            double customerSavings =scan.nextDouble(); 
            double customerdebt =scan.nextDouble(); 
            System.out.println("\nHow many years have you worked for?");
            int yearsWorked =scan.nextInt(); 
            System.out.println("What is your name?");
            String customerName =scan.next();
            
        
            
            if(customerSavings>=10000 && customerdebt<5000 && yearsWorked>=2){
                System.out.println("Congratulations" + customerName + "You have been approved!");
            }else{
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }



           

            // approve loan based on requirements
            //at least $10,000 in their savings account.
            //less than $5,000 in credit card debt.
            //more than 2 years of work experience.
 

        }else {
            System.out.println("\nOK. Have a nice day!");
        }























        //Task 2 - Print this if the decision is "yes"
        /*System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
                // Task 3 - Pick up each value 
            System.out.println("\nHow many years have you worked for?");
               // Task 4 - Pick up number of years

            System.out.println("What is your name?");
               // Task 5 - Pick up the user's name
                
               //Task 6 - Approve the mortgage if they meet the requirements (see article)
               //       - Otherwise, don't give them a mortgage.          
               System.out.println("Congratulations <name> You have been approved!");
               System.out.println("Sorry, you are not eligible for a mortgage.");

        //Task 2 - Print this if the decision was not "yes"
        System.out.println("\nOK. Have a nice day!");

*/
        scan.close();
    }
}
