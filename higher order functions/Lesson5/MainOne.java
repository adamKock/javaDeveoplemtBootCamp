package Lesson5;
import java.util.Arrays;
import java.util.List;

public class MainOne  {
    public static void main(String[] args) {
        
        // *******************forEach*******************
        List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "Wildflower87", "SerendipitousSurprise");
        usernames.stream()
        .map(username -> username.toUpperCase())
        .forEach(username -> System.out.println(username));

        // *******************toList*******************
        List<String> upperUsernames = usernames.stream()
        .map(username -> username.toUpperCase())
        .toList(); 


        // *******************reduce*******************

        List<Double> earnings = Arrays.asList(40.50, 60.00, 120.50, 20.00, 50.50, 20.00);
        Double totalEarnings =  earnings.stream().reduce(20.00, ((x,y) -> x+y));
        System.out.println("\nYour total earnings are $" + totalEarnings);

        // *******************reduce*******************

        List<Double> expenses = Arrays.asList(2.50, 4.00, 5.50, 2.00, 5.50, 2.00);
        Double fundsRemaining = expenses.stream().reduce(100.00, ((x,y) -> x-y));
        
        System.out.println("\nYou still have $ " + fundsRemaining);
       
       
        // *******************findFirst*******************
        List<String> aisles = Arrays.asList("apples", "bananas", "candy", "chocolate", "coffee", "tea");
        System.out.print("\nDo you guys sell coffee? ");
        String result = aisles.stream().filter(aisle -> aisle.equals("Coffee"))
        .findFirst()
        .orElse(null); 
        String response = result ==null ? "No we dont" : " Yes we do";
        System.out.println(response);

     
        
        
        // *******************count*******************        
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3, 4, 1);
        System.out.println("\nHow many times does the number 1 repeat?");
        long count = numbers.stream().filter(number -> number == 1).count(); 

        System.out.println("The number 1 repeats " + count + " times");




        //The Code below relates to workbook 13.6
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        names.stream().map(name -> ("Hello, " + name + "!"))
        .forEach(name -> System.out.println(name));

        //Task 2 
        List<String> userNames = Arrays.asList("sparklingunicorn", "galactic_goddess", "neon_ninja", "purplepixiedust");
        
        String username = userNames.stream().filter(userName -> userName.equals("neon_ninja"))
        .findFirst()
        .orElse(null); 
        System.out.println("Found you " + username);

        //task 3 
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6);
        long evenNum = numbersList.stream().filter(number -> number % 2 == 0).count(); 
        System.out.println("There are " + evenNum +  " Even numbers in the list ");
        
    }   
    
}

