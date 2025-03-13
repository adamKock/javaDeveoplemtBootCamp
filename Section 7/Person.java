import java.lang.reflect.Array;
import java.util.Arrays;

public class Person {

    private String name; 
    private String nationality; 
    private String dateOfBirth; 
    private String [] passport; 
    private int seatNumber; 

    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name= name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber =seatNumber; 
        this.passport = new String[3]; 
    
    }


    


    public Person(Person source){
        this.name= source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber =source.seatNumber; 
    
    }

    public String getName(){
        return this.name; 
    }
    public String getNationality(){
        return this.nationality; 
    }
    public String getDateOfBirth(){
        return this.dateOfBirth; 
    }
    public String[] getPassport(){
        return Arrays.copyOf(passport, passport.length); 
    }

    public int getSeatNumber(){
        return this.seatNumber; 
    }

    public void setName(String name){
        this.name = name; 
    }

    public void setNationality(String nationality){
        this.nationality = nationality; 
    }

    public void setdateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth; 
    }

    public void setPassport(){
        passport[0] = name; 
        passport[1] = nationality; 
        passport[2] = dateOfBirth; 

    }

    public void setSeatNumber(int seatNumber){
        this.seatNumber = seatNumber; 
    }

    public boolean applyPassport(){
        int number = (int) (Math.random() * 2);

        if(number==1){
            return true; 
        }else{
            return false; 
        }
    }

    public int chooseSeat(){
     int seatNumber = (int) (Math.random() * 11 + 1); 
        this.seatNumber= seatNumber; 
        return seatNumber; 
        
    }

    public String toString(){
        return "Name  " + this.name + ".\n"
        + "Nationality " + this.nationality + ".\n" 
        + "Date Of Birth " + this.dateOfBirth + ".\n"
        + "Seat Number " + this.seatNumber + ".\n"
        + "Passport " + Arrays.toString(passport) + ".\n"; 
    
    }
    
}
