public class HighScore {

    public static void main(String[] args) {
        
        int highScore = 0;
        int seat =0; 
        
        int [] numbers ={randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber()}; 
        System.out.print("Here are the scores: ");
        for(int i=0; i<numbers.length; i++){ 
            System.out.print(numbers[i] + " "); 
            if(numbers[i]>highScore){
                highScore=numbers[i];
                seat =i; 
            }
                
           
            }
            System.out.println("\n\nThe highest score is: " + highScore );
            System.out.println("\n\n It's the gentleman in seat " + seat );
        } 
        
        
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5)
        
     
    public static int randomNumber(){
        double randomNumber = Math.random()*5000; 
        randomNumber +=99; 
        int result = (int) randomNumber;    
        return result; 

}

    


}
