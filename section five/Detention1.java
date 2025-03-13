import java.util.Scanner;

public class Detention1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        // See Learn the Part for the instructions.
        String line = scanner.nextLine(); 

        for(int i=1; i<100; i++ ){
            System.out.println(i + ". " + line);
        }
        
        scanner.close(); 
        
    }
}
