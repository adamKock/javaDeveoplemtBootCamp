public class Receipt {
    public static void main(String[] args) {

        String[] apples = {"Gala", "Granny Smith", "Macintosh"}; 
        double[] priceApples ={1.99, 1.49, 1.29}; 

        System.out.println("Here's your receipt:\n");

        for(int i=0; i<apples.length; i++){
            System.out.println(apples[i] + " " + priceApples[i]);
                
                
            
        }
        
        // See instructions on Learn the Part (Workbook 6.8)
        
        
    }
}
