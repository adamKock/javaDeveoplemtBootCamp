import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        int[][] demoArray ={
                {72, 75, 89, 69},
                {58, 55, 25, 83},
                {71, 76, 28, 90}
            };

        
      for(int i=0; i<demoArray.length; i++){

        switch (i) {
            case 0: System.out.print("User 1:" + " "); break;
            case 1: System.out.print("User 2: " + " ");break;
            case 2: System.out.print("User 3: " + " ");break; 
        }
        for(int j=0; j<demoArray[i].length; j++){

            System.out.print(demoArray[i][j] +  " "); 
        }System.out.println("\n");
      }

       }
        
        
    }
    

