import java.util.Arrays;

public class UpdatingArrays {

    public static void main(String[] args) {

        String[] javacafe ={"Coffee", "Tea" , "Milkshakes"}; 
        javacafe[2]="Water"; 
        String menuString = Arrays.toString(javacafe); 
        System.out.println(menuString);

        String[] newMenu = new String[5];
        
        for(int i=0; i<javacafe.length; i++){
            newMenu[i] =javacafe[i]; 
        }
        newMenu[3] = "Dark Roast"; 
        newMenu[4] = "House Blend"; 


        System.out.println(Arrays.toString(newMenu)); 
         

        
    }
    
}
