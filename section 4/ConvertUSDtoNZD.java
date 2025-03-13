public class ConvertUSDtoNZD {

    public static void main(String[] args) {

        double originalMoney =19; 
        double nzd = convertUsd(originalMoney);
        printMoney(nzd);
        
    }
    
public static double convertUsd (double originalMoney){

    return originalMoney*1.5; 

}

public static void printMoney(double originalMoney){ 

    System.out.println("This is how much money you have " + originalMoney);
}

}
