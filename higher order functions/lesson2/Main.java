package lesson2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);

        integers.sort((right , left) -> {
            return right.compareTo(right);
        });

        integers.forEach(integer -> {
            System.out.println(integer);
        });

        List<Double> prices = Arrays.asList(55.99, 33.99, 88.99, 11.49, 55.99, 111.99, 77.99);

        prices.sort((right , left) -> {
            return left.compareTo(right);
        });

        System.out.println("\nPrices\n------");

        prices.forEach(price -> {
            System.out.println(price);
        });

        List<String> books = Arrays.asList(
            "To Kill a Mockingbird",
            "The Great Gatsby",
            "Pride and Prejudice",
            "The Catcher in the Rye",
            "The Alchemist",
            "One Hundred Years of Solitude",
            "Moby-Dick",
            "The Brothers Karamazov",
            "The Lord of the Rings",
            "The Picture of Dorian Gray"
        );

        books.sort((right, left) -> {
            return right.compareTo(left); 
        });

       

        System.out.println("\nLibrary\n--------");

        books.forEach(book ->{
            System.out.println(book);
        });

        Map<String, Integer> coffeeRatings = new HashMap<>();
        coffeeRatings.put("Starbucks House Blend", 7);
        coffeeRatings.put("Peet's French Roast", 8);
        coffeeRatings.put("Intelligentsia Black Cat", 9);
        coffeeRatings.put("Blue Bottle Three Africas", 10);
        coffeeRatings.put("Philz Mint Mojito Iced Coffee", 8);
        coffeeRatings.put("Camber Coffee Ethiopia Yirgacheffe", 9);
        coffeeRatings.put("Four Barrel Guatemala Finca El Injerto", 7);
        coffeeRatings.put("Heart Coffee Bolivia La Morena", 8);
        coffeeRatings.put("Ritual Coffee Nicaragua La Ilusión", 10);
        coffeeRatings.put("Verve Coffee Roasters El Salvador Finca Kilimanjaro", 9);
        
        System.out.println("\nMenu\n-------");

        coffeeRatings.forEach((key, value) ->{
            System.out.println(" Coffee " + key + " Rating " + value);
        });


        Map<String, Item> map = new HashMap<>();
        map.put("WIDG-001", new Item("Widget", 3.99));
        map.put("GADG-002", new Item("Gadget", 5.99));
        map.put("THNG-003", new Item("Thingamajig", 2.99));
        map.put("DBOO-004", new Item("Doo-dad", 4.99));
        map.put("WIDG-005", new Item("Super Widget", 6.99));
        map.put("GADG-006", new Item("Super Gadget", 8.99));
        map.put("THNG-007", new Item("Super Thingamajig", 15));
        map.put("DOFO-008", new Item("Super Doo-dad", 10));

        System.out.println("\nSKU \t\tPrice\tItem");

        map.forEach((sku, item) ->{
           // System.out.println(sku + "\t" + Item.getPrice() + "\t" + Item.getName());
        } );


        List<Double> prices1 = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream()
            .filter(price -> price > 100)  // Keep prices > 100
            .map(price -> price - 20)      // Subtract 20 from each price
            .sorted(Comparator.reverseOrder()) // Sort in descending order
            .map(price -> "$ " + price)    // Format each price with "$"
            .forEach(price -> System.out.println(price));  // Print each formatted pric
    }
    

}





