public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Friday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");

        System.out.println("Hmm, let me check my calendar.");
        switch (day) {
                case "Monday":System.out.println("Yes Mon"); break; 
                case "Tuesday":System.out.println("Yes Tues");break;
                case "Wednesday":System.out.println("No Wed");break;
                case "Thursday": System.out.println("Yes Thur");break;
                case "Friday": System.out.println("No Fri");break;
                case "Saturday": System.out.println("yes weekend");break;
                case "Sunday": System.out.println("yes weekend");break;
                 
        }
        //Check 'calendar' here:    
       
        

    }
}
