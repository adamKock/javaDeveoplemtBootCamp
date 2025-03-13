public class WorkSchedule {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int day = 6;   //3rd day of the week...
        boolean holiday = false;
         
        // IF - ELSE IF - ELSE HERE!
        // Setup conditions - if it's a holiday then ypu dont have work 
        //if it's a weekend then you dont have work
        //if it's a weekday then you have work

        if (day>5){
            System.out.println("It's the weekend, no work!"); 
        }else if (holiday){
            System.out.println("Woohoo, no work");  
        }
        else{ 
            System.out.println("Wake up at 7:00 :("); 
        }

        
        
        }

    }
