public class Exams {
    public static void main(String[] args) {
        
        String[] names ={ "Harry", "Neville", "Ron", "Hermione", "Seamus"}; 
        // Instructions for this workbook are on Learn the Part (Workbook 6.1).

       

        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
        
        //System.out.println(names[0] +", you will take seat " + 0);
        //System.out.println(names[1] +", you will take seat " + 1);
        //System.out.println(names[2] +", you will take seat " + 2);
        //System.out.println(names[3] +", you will take seat " + 3);
        //System.out.println(names[4] +", you will take seat " + 4);

        // Compare your result to what's on Learn the Part.
        for(int i=0; i<names.length; i++ ){

            System.out.println(names[i] +", you will take seat " + i); 
        }
    }
}
