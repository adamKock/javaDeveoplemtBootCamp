
public class Microscope extends LabEquipment{

    private int magnification;
    private static final int minimumMag = 1; 

    public Microscope(int magnification,String manufacturer, String model, int year) {
       super(manufacturer, model, year);
        setMagnification(magnification);
    }

    public Microscope(Microscope source) {
       super(source); 
       setMagnification(source.magnification);
     }

    public int getMagnification() {
        return this.magnification;
    }

    public void setMagnification(int magnification) {
        if(magnification<minimumMag){
            throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance() {
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

    @Override
    public LabEquipment clone() {
        return new Microscope (this); 
    }
    

    
}
