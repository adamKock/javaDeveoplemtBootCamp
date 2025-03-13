import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi Timmy, choose a number to count to:");
        // See Learn the Part for the instructions.
        int line = scanner.nextInt(); 
        System.out.println("Great, here is how it's done");

        for(int i=0; i<=line ; i++ ){
            System.out.print(i + " ");
        }

        scan.close();
    }
}
