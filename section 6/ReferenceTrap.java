import java.lang.reflect.Array;
import java.util.Arrays;

public class ReferenceTrap {
        public static void main(String[] args) {

            String[] staffLastYear={"Jon", "Alex", "Bob"}; 
            String[] staffThisyear=Arrays.copyOf(staffLastYear,staffLastYear.length); 
            staffThisyear[1] = "Lisa";    
            
            System.out.println(Arrays.toString(staffLastYear));
            System.out.println(Arrays.toString(staffThisyear));
            
        }
}
