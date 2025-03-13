public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;    //temperature at midnight in fahrenheit
        //double fahrenheitTemp = 75; 
        fahrenheitToCelsius(noon); 
        fahrenheitToCelsius(evening); 
        fahrenheitToCelsius(midnight); 
        printTemp(noon);
        printTemp(evening);
        printTemp(midnight);
        
        
      
    }
    
    //Task 1: Make a function here. See the doc comments below. 
    public static double  fahrenheitToCelsius (double fahrenheitTemp){
        return  (fahrenheitTemp-32) * 5/9; 
        
    }
 


    public static void printTemp ( double fahrenheitTemp){
        System.out.println("temperature in celsius " + fahrenheitToCelsius(fahrenheitTemp));
        System.out.println("temperature in fahrenheit " + fahrenheitTemp);
    
}}