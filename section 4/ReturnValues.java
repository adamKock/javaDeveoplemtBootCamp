public class ReturnValues {
    
    public static void main(String[] args) {

      double area1 = calculateArea(2.3, 3.9); 
      double area2 = calculateArea(5.3, 2.9); 
      double area3 = calculateArea(7.3, 1.9); 
      String englishExplanation = explainArea("English"); 
      String frenchExplanation = explainArea("French"); 
      String spanishExplanation = explainArea("Spanish"); 
      String italianExplanation = explainArea("Italian"); 

        
    }
    
    public static double  calculateArea (double length, double width){
        double area = length*width; 
        return area; 
        

        
    }

    public static String explainArea (String language ){
      switch (language){
        case "English": return "Area equals length * width"; 
        case "French ": return "La surface est egale a la longueur * la largeur";
        case "Spanish": return "area es igual a largo * ancho";
        default: return "Language not available"; 
      }


      public static void printArea( double length, double width, double area){
        System.out.println("");
      }


    }
}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"
