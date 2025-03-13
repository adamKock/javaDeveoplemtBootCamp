public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 0;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!

        if ( temp>11){
            System.out.println("It's warm. Go outside!"); 
            forecast = "it's warm"; 

        }
        else if (temp <= -1){
            System.out.println("It's freezing");  
            forecast = "it's freezing"; 
        }
        else if (temp>=0 && temp<=10){ 
            System.out.println("The forecast is Chilly. Wear a coat!");  
            forecast = "The forecast is Chilly. Wear a coat!";  
        }
        else{
            System.out.println("Look at the weather"); 
        }
        
        System.out.println(forecast);
    }
}
