import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // Creating Stream from Datasource: Array
        String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};
        Arrays.stream(greetings).forEach(greeting -> System.err.println(greeting));


        // Creating Stream from Datasource: File
        try{
            Path path = Paths.get("chourus.txt");
            Files.lines(path).forEach(line ->System.out.println(line));
        }catch(IOException exception){
            System.out.println(exception);
        }


        Path workBookPath = Paths.get("textFile.txt"); 
        try {
            Files.lines(workBookPath).filter(emails -> !emails.startsWith(">>: Promotions:"))
            .forEach(email -> System.out.println(email));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       


    }
}