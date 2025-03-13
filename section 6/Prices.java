public class Prices {
    public static void main(String[] args) {
        // The instructions for this workbook are on Learn the Part (workbook 6.13)

        double [][] prices ={
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };
        // this is another way to loop through 2D arrays in a quicker easier fashion 
        for(int i=0; i<prices.length; i++){        
            switch (i) {
            case 0: System.out.print("Baking: "); break;
            case 1: System.out.print("Beverage: "); break;
            case 2: System.out.print("Cereals: "); break;
        }

        for(int j=0; j<prices.length; j++){
            System.out.print(prices[i][j] + " ");

        }System.out.print("\n");
    }
 //Below is one way how to loop through things 
        for(int i=0; i<3; i++){

            System.out.println("Baking : " + prices[i][0] + " " + prices[i][1] + " " + prices[i][2] + " " + prices[i][3] + " " + prices[i][4]);
            
            break; 
        }

        System.out.println("Baking : " + prices[0][0] + " " + prices[0][1] + " " + prices[0][2] + " " + prices[0][3] + " " + prices[0][4]);
        System.out.println("Bevarge : " + prices[1][0] + " " + prices[1][1] + " " + prices[1][2] + " " + prices[1][3] + " " + prices[1][4]);
        System.out.println("Cereals : " + prices[2][0] + " " + prices[2][1] + " " + prices[2][2] + " " + prices[2][3] + " " + prices[2][4]);

    }
}
