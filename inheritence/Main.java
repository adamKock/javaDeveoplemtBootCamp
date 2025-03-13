import Product.Pants;
import Product.Shirt;
import Product.Shirt.Size;

public class Main {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(25, "Black", "Nike", Size.LARGE); 
        shirt.fold();


        Pants pants = new Pants(50, "Blue", "Levi's", 32, 32); 
        pants.fold(); 


    }

}
