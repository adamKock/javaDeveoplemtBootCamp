public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 170;    //gryffindor points
        int ravenclaw = 2000;    //ravenclaw points

        int margin = gryffindor-ravenclaw; 
        System.out.println(margin);

        if ( margin>=300){
            System.out.println("Gryffindor takes the house cup!");
        }
        else if (margin>= 0 ){
            System.out.println("In second place, Gryffindor!"); 
        }
        else if (margin>= -100){
            System.out.println("In third place, Gryffindor!"); 
        }
        else {
            System.out.println("You Lost");
        }
        
    }
}
