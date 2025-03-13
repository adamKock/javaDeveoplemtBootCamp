import java.util.Arrays;

class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String [] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts= Arrays.copyOf(parts, parts.length); 
    }
   

    
  

    public Car(Car source){
        this.make= source.make; 
        this.price= source.price; 
        this.year=source.year; 
        this.color= source.color; 
        this.parts= Arrays.copyOf(source.parts, source.parts.length); 
    }


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public String [] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);  
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String [] parts){
        this.parts= Arrays.copyOf(parts, parts.length); 
    }

    public void drive(){
        System.out.println("You bough the beautiful " +  this.color + " " + this.year + " " + this.make);
        System.out.println("Enjoy the car please drive safe");
    }

    public String toString(){
        
        return "Make: " + this.make + ".\n" 
        +  "Price: " + this.price + ".\n"
        +  "Year: " + this.year + ".\n"
        +  "Color: " + this.color + ".\n"
        +  "Parts: " + Arrays.toString(parts) + ".\n";

    }
    
}
