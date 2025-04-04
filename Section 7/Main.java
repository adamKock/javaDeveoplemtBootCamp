import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };

        Dealership dealership = new Dealership(cars);

        // Get a deep copy of the car at index 0
        Car carAtIndex0 = dealership.getCar(0);
        System.out.println("Original car make: " + carAtIndex0.getMake());

        // Modify the car's make
        carAtIndex0.setMake("Toyota");
        System.out.println("Modified car make: " + carAtIndex0.getMake());

        // Verify that the car in the dealership is not affected
        System.out.println("Dealership car make: " + dealership.getCar(0).getMake());

        // Create a new Car object
        Car newCar = new Car("BMW", 10000, 2018, "silver", new String[] {"tires", "filter", "transmission"});

        // Set the car at index 1 in the dealership to a deep copy of the newCar
        dealership.setCar(1, newCar);

        // Verify that the car at index 1 in the dealership has been updated
        System.out.println("Dealership car make at index 1: " + dealership.getCar(1).getMake());

        // Modify the newCar object
        newCar.setMake("Audi");

        // Verify that the car in the dealership is not affected
        System.out.println("Dealership car make at index 1 after modifying newCar: " + dealership.getCar(1).getMake());


        Person[] people = new Person[] { 
            new Person("Cleopatra", "Egypt", "69 BC", 1),
            new Person("Alexander the Great", "Macedon", "356 BC", 2),
            new Person("Julius Caesar", "Rome", "100 BC", 3),
            new Person("Hannibal", "Carthage", "247 BC", 4),
            new Person("Confucius", "China", "551 BC", 5),
            new Person("Pericles", "Greece", "429 BC", 6),
            new Person("Spartacus", "Thrace", "111 BC", 7),
            new Person("Marcus Aurelius", "Rome", "121 AD", 8),
            new Person("Leonidas", "Greece", "540 BC", 9),
            new Person("Sun Tzu", "China", "544 BC", 10),
            new Person("Hammurabi", "Babylon", "1750 BC", 11),
        };
        Airline airline = new Airline();

        for(int i=0; i<people.length; i++){
            boolean passportApproved = people [i].applyPassport(); 
            if(passportApproved){
                airline.createReservation(people[i]);
            }else{
                 System.out.println("Sorry " + people[i].getName() + ". Your passport: " + Arrays.toString(people[i].getPassport()) + " is not valid.\n"); 
            }
            
        }

        System.out.println(airline.getPerson(1));
        System.out.println(airline.getPerson(5));
        System.out.println(airline.getPerson(10));
    
    }
}
